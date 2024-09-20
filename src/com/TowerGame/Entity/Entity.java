package com.TowerGame.Entity;

import java.awt.*;
import java.awt.image.BufferedImage;

public abstract class Entity {
    private int currentXP;
    private int maxXP;

    private BufferedImage texture;
    private Rectangle hitBox;
    private Rectangle textureBox;

    public Entity(int currentXP, int maxXP, BufferedImage texture, Rectangle hitBox,
                  int worldX, int worldY, int tileWidth, int tileHeight) {
        this.currentXP = currentXP;
        this.maxXP = maxXP;
        this.texture = texture;
        this.hitBox = hitBox;
        textureBox = new Rectangle(worldX, worldY, tileWidth, tileHeight);
    }

    public abstract void update();

    public abstract void draw(Graphics2D g);

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

    public int getWorldX() {
        return textureBox.x;
    }

    public int getWorldY() {
        return textureBox.y;
    }

    public void setWorldX(int worldX) {
        textureBox.x = worldX;
    }

    public void setWorldY(int worldY) {
        textureBox.y = worldY;
    }

    public int getTileWidth() {
        return textureBox.width;
    }

    public int getTileHeight() {
        return textureBox.height;
    }
}
