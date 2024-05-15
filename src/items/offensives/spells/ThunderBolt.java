package items.offensives.spells;

import items.offensives.Spell;

public class ThunderBolt extends Spell {
    public ThunderBolt(){
        super();
        this.setName("ThunderBolt");
        this.setDamage(2);
        this.setClassRestriction(getMage());
    }
}
