package com.TowerGame;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel implements Runnable {
    Dimension panelDimension;
    public GamePanel(final Dimension panelDimension) {
        this.panelDimension = panelDimension;
        setPreferredSize(panelDimension);

    }

    @Override
    public void run() {
        System.out.println("test");
        Graphics g = this.getGraphics();
        g.setColor(Color.RED);
        g.drawRect(600, 200, 100, 50);
        g.dispose();
    }

//    @Override
//    protected void paintComponent(Graphics g) {
//        super.paintComponent(g); // Always call super.paintComponent to ensure proper painting of the component's background
//        g.setColor(Color.RED);
//        g.fillRect(600, 200, 50, 100); // Draw the rectangle here
//    }
}


