package items.defensives;

import characters.Job;
import items.DefensiveEquipment;

public class Shield extends DefensiveEquipment {
    public void equip(Job character, Shield item) {
        character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
    }
}
