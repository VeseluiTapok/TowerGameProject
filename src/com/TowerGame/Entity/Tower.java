package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tower extends Entity{
    private int currentCoin;
    private int maxCoin;
    private int coinIncome;

    public Tower(int currentXP, int maxXP, BufferedImage texture, Rectangle hitBox,
                 int currentCoin, int maxCoin, int coinIncome) {
        super(currentXP, maxXP, texture, hitBox);

        this.currentCoin = currentCoin;
        this.maxCoin = maxCoin;
        this.coinIncome = coinIncome;
    }
}

