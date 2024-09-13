package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Unit extends Entity{

    private int moveSpeed;
    private int damage;
    private int attackSpeed;
    private int price;
    private int rechargePrice;
    private int attackRange;

    public Unit (int currentXP, int maxXp, BufferedImage texture, Rectangle hitBox, int moveSpeed,
                 int damage, int attackSpeed, int price, int recharge, int attackRange) {

        super(currentXP, maxXp, texture, hitBox);
        this.moveSpeed = moveSpeed;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.price = price;
        this.rechargePrice = recharge;
        this.attackRange = attackRange;
    }

    public void attack(Unit unit) {
        super.setCurrentXP(super.getCurrentXP() - damage);
    }
}
