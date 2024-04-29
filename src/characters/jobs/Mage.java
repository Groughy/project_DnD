package characters.jobs;

import characters.Job;
import items.Weapon;

public class Mage extends Job {
    Weapon weapon;
    public Mage(String mage) {
        this.setName("Mage");
        this.setLifePoints(6);
        this.setAttackPoints(15);
        this.setWeapon(new Weapon("beginning staff",0,"Mage"));
    }
}
