package characters.jobs;

import characters.Job;
import items.Weapon;

public class Warrior extends Job {
    Weapon weapon;
    public Warrior(String warrior) {
        this.setName("Warrior");
        this.setLifePoints(10);
        this.setAttackPoints(10);
        this.setWeapon(new Weapon("beginning sword",0,"Warrior"));
    }
}
