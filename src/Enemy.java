public class Enemy {
    private String name;
    private int lifePoints;

    public int getAttackPoints() {
        return attackPoints;
    }

    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int attackPoints;

    public Enemy(String name, int lifePoints, int attackPoints) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.attackPoints = attackPoints;
    }

    public Enemy() {
        this.name = "Goblin";
        this.lifePoints = 6;
        this.attackPoints = 1;
    }
    Enemy Goblin = new Enemy("Goblin", 6, 1);
    Enemy Warlock = new Enemy("Warlock",9,2);
    Enemy Dragon = new Enemy("Dragon",15,4);
}
