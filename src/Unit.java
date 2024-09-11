public class Unit {
    private int currentXP;
    private int maxXp;
    private int moveSpeed;
    private int damage;
    private int attackSpeed;
    private int price;
    private int rechargePrice;
    private int attackRange;

    public Unit (int currentXP, int maxXp, int moveSpeed, int damage,
                 int attackSpeed, int price, int recharge, int attackRange) {
        this.currentXP = currentXP;
        this.maxXp = maxXp;
        this.moveSpeed = moveSpeed;
        this.damage = damage;
        this.attackSpeed = attackSpeed;
        this.price = price;
        this.rechargePrice = recharge;
        this.attackRange = attackRange;
    }

    public void attack(Unit unit) {
        unit.currentXP -= damage;
    }
}
