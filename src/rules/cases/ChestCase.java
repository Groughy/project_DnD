package rules.cases;

import characters.Job;
import rules.Case;
import rules.Find;

public class ChestCase implements Case, Find {


    public ChestCase(Job character) {
        getLoot(character);
    }

    public void getLoot(Job character) {
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
