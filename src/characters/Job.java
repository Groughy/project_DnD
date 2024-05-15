package characters;

import items.DefensiveEquipment;
import items.OffensiveEquipment;

public class Job extends Character{
    private String nameCharacter;
    private OffensiveEquipment weapon;
    private DefensiveEquipment shield;
    private int defensePoints;

    public DefensiveEquipment getShield() {
        return shield;
    }

    public void setShield(DefensiveEquipment shield) {
        this.shield = shield;
    }

    public int getDefensePoints() {
        return defensePoints;
    }

    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    public OffensiveEquipment getWeapon() {
            return weapon;
    }

    public void setWeapon(OffensiveEquipment weapon) {
        this.weapon = weapon;
    }

    public Job() {
        super();
        weapon = new OffensiveEquipment("beginning weapon", 0);
    }

    public String getNameCharacter() {
        return nameCharacter;
    }

    public void setNameCharacter(String nameCharacter) {
        this.nameCharacter = nameCharacter;
    }
    @Override
    public String toString() {
        return nameCharacter + " is a " + getNameCharacter() + " with " + getLifePoints() + " life points, " + getAttackPoints() + " attack points, and is equipped with a " + getWeapon().getName() + ".";
    }
}
