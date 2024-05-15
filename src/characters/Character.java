package characters;

import items.DefensiveEquipment;

abstract public class Character {
    private String name;
    private int lifePoints;
    private int attackPoints;
    private int defensePoints;
    private int defaultAttackPoints;
    private int defaultDefensePoints;

        public Character() {

    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(DefensiveEquipment defensiveEquipment) {
        this.defensePoints = getDefaultDefensePoints() + defensiveEquipment.getDefensePoints();
    }

    public int getDefaultAttackPoints() {
        return defaultAttackPoints;
    }

    public void setDefaultAttackPoints(int defaultAttackPoints) {
        this.defaultAttackPoints = defaultAttackPoints;
    }

    public int getDefaultDefensePoints() {
        return defaultDefensePoints;
    }

    public void setDefaultDefensePoints(int defaultDefensePoints) {
        this.defaultDefensePoints = defaultDefensePoints;
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

    public void setAttackPoints(int offensiveEquipment) {
        this.attackPoints = getDefaultAttackPoints() + offensiveEquipment;
    }
    public int getLifePoints() {
        return lifePoints;
    }

    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
}