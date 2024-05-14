package rules;

import characters.Job;
import exceptions.CantEquipItException;
import rules.cases.ChestCase;
import rules.cases.EmptyCase;
import rules.cases.EnemyCase;
import java.util.Random;

public interface Case {
    Random rand = new Random();

    default void randomizeCase(Job character, Game game) throws CantEquipItException {
        int position = rand.nextInt(100);
        if (position < 30) {
            new EnemyCase(character, game);
        } else if (position < 50) {
            new ChestCase(character);
        } else {
            new EmptyCase();
        }
    }
}
