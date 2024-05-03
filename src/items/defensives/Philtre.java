package items.defensives;

import characters.Job;
import items.DefensiveEquipment;

public class Philtre extends DefensiveEquipment {
    public void usePhiltre(Job character, Philtre item) {
        character.setDefensePoints(character.getDefensePoints() + item.getDefensePoints());
    }
}
