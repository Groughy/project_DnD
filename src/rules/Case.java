package rules;

import characters.Job;
import java.util.Random;

public interface Case {
    Random rand = new Random();

    void randomizeCase(Job character, Game game);
}
