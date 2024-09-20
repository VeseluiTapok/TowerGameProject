package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Tower extends Entity{
    private int currentCoin;
    private int maxCoin;
    private int coinIncome;

    public Tower(int currentXP, int maxXP, BufferedImage texture, Rectangle hitBox,
                 int currentCoin, int maxCoin, int coinIncome, int worldX, int worldY
                  , int tileWidth, int tileHeight) {
        super(currentXP, maxXP, texture, hitBox, worldX, worldY, tileWidth, tileHeight);

        this.currentCoin = currentCoin;
        this.maxCoin = maxCoin;
        this.coinIncome = coinIncome;
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {

    }
}

