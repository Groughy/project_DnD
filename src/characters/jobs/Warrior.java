package characters.jobs;

import characters.Job;
import items.OffensiveEquipment;

public class Warrior extends Job {
    OffensiveEquipment weapon;
    public Warrior(String warrior) {
        this.setName("Warrior");
        this.setLifePoints(10);
        this.setAttackPoints(10);
        this.setWeapon(new OffensiveEquipment("beginning sword",0,"Warrior"));
    }
}
