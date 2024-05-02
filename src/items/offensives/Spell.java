package items.offensives;

import characters.jobs.Mage;
import items.OffensiveEquipment;

public class Spell extends OffensiveEquipment {

    public Spell(String beginningStaff, int i, Mage mage) {
        super(beginningStaff, i, mage);
    }

    public Mage getMage() {
        return mage;
    }

    private Mage mage;
    public Spell() {

    }
}
