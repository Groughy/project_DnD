package characters.jobs;

import characters.Job;
import items.OffensiveEquipment;

public class Mage extends Job {
    OffensiveEquipment weapon;
    public Mage() {
        this.setName("Mage");
        this.setLifePoints(6);
        this.setAttackPoints(15);
        this.setWeapon(new OffensiveEquipment("beginning staff",0,"Mage"));
    }
}
