package items.offensives;

import characters.Job;
import characters.jobs.Mage;
import items.OffensiveEquipment;

public class Spell extends OffensiveEquipment {

    private Mage mage;

    public Spell(String beginningStaff, int i, Mage mage) {
        super(beginningStaff, i, mage);
    }

    public Mage getMage() {
        return mage;
    }
    public Spell() {
    }


}
