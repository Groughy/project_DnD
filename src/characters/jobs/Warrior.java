package characters.jobs;

import characters.Job;
import items.defensives.Shield;
import items.offensives.Weapon;
import rules.interactions.Equip;

public class Warrior extends Job implements Equip {

    public Warrior() {
        this.setNameCharacter("Warrior");
        this.setLifePoints(10);
        this.setDefaultAttackPoints(10);
        this.setWeapon(new Weapon("beginning sword", 0, Warrior.this));
        this.setAttackPoints(getWeapon().getDamage());
        this.setDefaultDefensePoints(0);
        this.setShield(new Shield("beginning shield", 0, Warrior.this));
    }
}
