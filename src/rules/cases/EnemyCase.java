package rules.cases;

import characters.enemies.Dragon;
import characters.enemies.Goblin;
import characters.enemies.Warlock;
import rules.Case;


public class EnemyCase implements Case {

    public EnemyCase() {
        getEnemy();
    }

    public void getEnemy() {
        int randomEnemy = rand.nextInt(100) + 1;
        if (randomEnemy < 70) {
            System.out.println("Tu as trouvé un gobelin.");
            new Goblin();
        } else if (randomEnemy < 90) {
            System.out.println("Tu as trouvé un sorcier.");
            new Warlock();
        } else {
            System.out.println("Tu as trouvé un dragon.");
            new Dragon();
        }
    }

    @Override
    public String toString() {
        return "EnemyCase";
    }
}
