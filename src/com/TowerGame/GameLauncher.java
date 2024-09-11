package com.TowerGame;

import javax.swing.*;

public class GameLauncher {

    public static void main(String[] args) {
        JFrame window = new JFrame();
        window.setTitle("TowerGame");
        window.setResizable(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        GamePanel panel = new GamePanel();
        window.add(panel);

        window.pack();

        window.setLocationRelativeTo(null);
        window.setVisible(true);

        panel.startGameThread();
    }
}
