package characters;

public class Enemy extends Character{
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

    public String getNameCharacter() {
        return name;
    }

    public void setNameCharacter(String nameCharacter) {
        this.name = nameCharacter;
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
}
