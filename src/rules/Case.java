package rules;

import characters.Job;
import rules.cases.ChestCase;
import rules.cases.EmptyCase;
import rules.cases.EnemyCase;

import java.util.Random;

public interface Case {
    Random rand = new Random();

    default void randomizeCase() {
        int position = rand.nextInt(100);
        if (position < 30) {
            new EnemyCase();
        } else if (position < 50) {
            new ChestCase();
        } else {
            new EmptyCase();
        }
    }

    public default void interact(Job character) {
        if (this instanceof EnemyCase) {
            ((EnemyCase) this).fight(character, ((EnemyCase) this).getEnemy());
        } else if (this instanceof ChestCase) {
            ((ChestCase) this).useItem(character);
        }
    }
}
