package items.offensives.spells;

import items.offensives.Spell;

public class FireBall extends Spell {

    public FireBall(){
        super();
        this.setName("FireBall");
        this.setDamage(7);
        this.setClassRestriction(getMage());
    }
}

