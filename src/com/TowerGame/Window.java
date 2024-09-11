package com.TowerGame;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() {

        Dimension screenDimension = Toolkit.getDefaultToolkit().getScreenSize();
        setTitle("TowerGame");


        setContentPane(new GamePanel(screenDimension));
        pack();


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
