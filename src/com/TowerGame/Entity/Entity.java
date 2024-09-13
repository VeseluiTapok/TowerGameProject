package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity {
    private int currentXP;
    private int maxXP;

    private BufferedImage texture;
    private Rectangle hitBox;

    public Entity(int currentXP, int maxXP, BufferedImage texture, Rectangle hitBox) {
        this.currentXP = currentXP;
        this.maxXP = maxXP;
        this.texture = texture;
        this.hitBox = hitBox;
    }

    public Rectangle getHitbox() {
        return hitBox;
    }

    public void setHitbox(Rectangle hitbox) {
        this.hitBox = hitbox;
    }

    public BufferedImage getTexture() {
        return texture;
    }

    public void setTexture(BufferedImage texture) {
        this.texture = texture;
    }

    public int getMaxXP() {
        return maxXP;
    }

    public void setMaxXP(int maxXP) {
        this.maxXP = maxXP;
    }

    public int getCurrentXP() {
        return currentXP;
    }

    public void setCurrentXP(int currentXP) {
        this.currentXP = currentXP;
    }

}
