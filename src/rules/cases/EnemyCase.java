package rules.cases;

import characters.Job;
import characters.enemies.Dragon;
import characters.enemies.Goblin;
import characters.enemies.Warlock;
import rules.Case;
import rules.Game;
import rules.interactions.Fight;

public class EnemyCase implements Case, Fight {

    public EnemyCase(Job character, Game game) {
        getEnemy(character, game);
    }

    public void getEnemy(Job character, Game game) {
        int randomEnemy = rand.nextInt(100) + 1;
        if (randomEnemy < 70) {
            System.out.println("Tu as trouvé un gobelin.");
           fightOrFlee(character, new Goblin(), game);
        } else if (randomEnemy < 90) {
            System.out.println("Tu as trouvé un sorcier.");
           fightOrFlee(character, new Warlock(), game);
        } else {
            System.out.println("Tu as trouvé un dragon.");
            fightOrFlee(character, new Dragon(), game);
        }
    }

    @Override
    public String toString() {
        return "EnemyCase";
    }


}
