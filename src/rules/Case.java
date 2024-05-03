package rules;

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
}
