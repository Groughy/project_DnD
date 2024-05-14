package rules.cases;

import characters.Job;
import exceptions.CantEquipItException;
import rules.Case;
import rules.interactions.Find;

public class ChestCase implements Case, Find {


    public ChestCase(Job character) throws CantEquipItException {
        getLoot(character);
    }

    public void getLoot(Job character) throws CantEquipItException {
        int randomLoot = rand.nextInt(100) + 1;
        if (randomLoot < 50) {
            findPotion(character);
        } else if (randomLoot < 80) {
            findOffensiveItem(character);
        } else {
            findDefensiveItem(character);
        }
    }
    @Override
    public String toString() {
        return "ChestCase";
    }
}
