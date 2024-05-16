package rules.interactions;

import characters.Enemy;
import characters.Job;
import rules.Game;

public interface Fight {

    void fight(Job character, Enemy enemy);

    void flee(Game game);

    void fightOrFlee(Job character, Enemy enemy, Game game);
}
