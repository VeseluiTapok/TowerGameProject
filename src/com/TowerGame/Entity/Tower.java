package com.TowerGame.Entity;

public class Tower {
    private int currentXP;
    private int maxXP;
    private int currentCoin;
    private int maxCoin;
    private int coinIncome;
    void Tower(int currentXP, int maxXP, int currentCoin, int maxCoin, int coinIncome) {
        this.currentXP = currentXP;
        this.maxXP = maxXP;
        this.currentCoin = currentCoin;
        this.maxCoin = maxCoin;
        this.coinIncome = coinIncome;
    }

}

