package characters.jobs;

import characters.Job;
import items.defensives.Philtre;
import items.offensives.Spell;
import rules.interactions.Equip;

public class Mage extends Job implements Equip {
    public Mage() {
        this.setNameCharacter("Mage");
        this.setLifePoints(6);
        this.setDefaultAttackPoints(15);
        this.setWeapon(new Spell("beginning staff", 0));
        this.setAttackPoints(getWeapon().getDamage());
        this.setDefaultDefensePoints(0);
        this.setShield(new Philtre("beginning philtre", 0));
    }
}
