package com.TowerGame;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    GamePanel panel;

    public Window() {
        setTitle("TowerGame");
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new GamePanel();
        setContentPane (new GamePanel());

        pack();

        setLocationRelativeTo(null);
        setVisible(true);

        panel.startGameThread();
    }
}
