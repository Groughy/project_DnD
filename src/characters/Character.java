package characters;

abstract public class Character {
    private String name;
    private int lifePoints;
    private int attackPoints;

        public Character() {

    }


    public String getNameCharacter() {
        return name;
    }

    public void setNameCharacter(String nameCharacter) {
        this.name = nameCharacter;
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