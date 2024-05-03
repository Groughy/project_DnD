package characters.jobs;

import characters.Job;
import items.offensives.Spell;

public class Mage extends Job {
    public Mage() {
        this.setNameCharacter("Mage");
        this.setLifePoints(6);
        this.setAttackPoints(15);
        this.setWeapon(new Spell("beginning staff",0,this));
        this.setDefensePoints(0);
    }
}
