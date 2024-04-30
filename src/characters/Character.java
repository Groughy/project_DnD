package characters;

abstract public class Character {
    private String name;
    private int lifePoints;
    private int attackPoints;

        public Character() {

    }

    @Override
    public String toString() {
        Job job = (Job) this;
        return name + " is a " + job.getName() + " with " + getLifePoints() + " life points, " + getAttackPoints() + " attack points, and is equipped with a " + job.getWeapon().getName() + ".";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}