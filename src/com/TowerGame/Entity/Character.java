package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Character extends Entity{

    private int moveSpeed;
    private int damage;
    private int attackSpeed;
    private int price;
    private int rechargePrice;
    private int attackRange;

    public Character(int currentXP, int maxXp, BufferedImage texture, Rectangle hitBox, int moveSpeed,
                     int damage, int attackSpeed, int price, int recharge, int attackRange,
                     int worldX, int worldY, int tileWidth, int tileHeight) {

        super(currentXP, maxXp, texture, hitBox, worldX, worldY, tileWidth, tileHeight);
        this.moveSpeed = moveSpeed;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.price = price;
        this.rechargePrice = recharge;
        this.attackRange = attackRange;
    }

    public void attack(Character character) {
        character.setCurrentXP(character.getCurrentXP() - damage);
    }

    @Override
    public void update() {

    }

    @Override
    public void draw(Graphics2D g) {
        g.drawImage(getTexture(), getWorldX(), getWorldY(), getTileWidth(), getTileHeight(), null);
    }
}
