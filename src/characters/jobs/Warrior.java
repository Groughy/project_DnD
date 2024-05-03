package characters.jobs;

import characters.Job;
import items.OffensiveEquipment;
import items.offensives.Weapon;

public class Warrior extends Job {
    OffensiveEquipment weapon;
    public Warrior() {
        this.setNameCharacter("Warrior");
        this.setLifePoints(10);
        this.setAttackPoints(10);
        this.setWeapon(new Weapon("beginning sword",0,Warrior.this));
        this.setDefensePoints(0);
    }
}
