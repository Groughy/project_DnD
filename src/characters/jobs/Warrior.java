package characters.jobs;

import characters.Job;
import items.OffensiveEquipment;
import items.offensive.Weapon;

public class Warrior extends Job {
    OffensiveEquipment weapon;
    public Warrior() {
        this.setName("Warrior");
        this.setLifePoints(10);
        this.setAttackPoints(10);
        this.setWeapon(new Weapon("beginning sword",0,"Warrior"));
    }
}
