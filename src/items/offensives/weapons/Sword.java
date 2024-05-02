package items.offensives.weapons;

import items.offensives.Weapon;

public class Sword extends Weapon {
    public Sword(){
        super();
        this.setName("Sword");
        this.setDamage(5);
        this.setClassRestriction(getWarrior());
    }
}
