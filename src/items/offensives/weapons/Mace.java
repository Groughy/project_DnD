package items.offensives.weapons;

import items.offensives.Weapon;

public class Mace extends Weapon {

    public Mace(){
        super();
        this.setName("Mace");
        this.setDamage(3);
        this.setClassRestriction(getWarrior());
    }
}
