package items.offensive;

import characters.jobs.Mage;
import items.OffensiveEquipment;

public class Spell extends OffensiveEquipment {

    private Mage mage;
    public Spell(String name, int damage, Mage mage) {
        super(name, damage, mage);
    }
}
