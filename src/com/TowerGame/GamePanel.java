package com.TowerGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    Dimension panelDimension;
    Thread gameThread;

    private int FPS = 60;

    private int rectangleX = 100;
    private int rectangleY = 100;

    public GamePanel() {
        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();

        this.panelDimension = screenDimension;
        setPreferredSize(panelDimension);
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
    }

    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }

    @Override
    public void run() {
        while (gameThread != null) {
            double drawInterval = 1000000000 / FPS;
            double nextDrawTime = System.nanoTime() + drawInterval;

            update();

            repaint();

            try {
                double remainingTime = nextDrawTime - System.nanoTime();
                remainingTime = remainingTime/1000000;

                if (remainingTime < 0) {
                    remainingTime = 0;
                }

                Thread.sleep((long) remainingTime);

                nextDrawTime += drawInterval;
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void update() {
        rectangleX+=1;
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D graphics2D = (Graphics2D) g;

        graphics2D.setColor(Color.RED);

        graphics2D.fillRect(rectangleX, rectangleY, 50, 50); // Draw the rectangle here

        graphics2D.dispose();
    }
}


