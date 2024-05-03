package rules.cases;

import characters.Enemy;
import characters.Job;
import characters.enemies.Dragon;
import characters.enemies.Goblin;
import characters.enemies.Warlock;
import rules.Menu;
import rules.Case;


public class EnemyCase implements Case {

    private Menu menu = new Menu();
    public EnemyCase() {
        getEnemy();
    }

    public Enemy getEnemy() {
        int randomEnemy = rand.nextInt(100) + 1;
        if (randomEnemy < 70) {
            System.out.println("Tu as trouvé un gobelin.");
            return new Goblin();
        } else if (randomEnemy < 90) {
            System.out.println("Tu as trouvé un sorcier.");
            return new Warlock();
        } else {
            System.out.println("Tu as trouvé un dragon.");
            return new Dragon();
        }
    }

    @Override
    public String toString() {
        return "EnemyCase";
    }

    public void fight(Job character, Enemy enemy) {
        while (character.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
            character.setLifePoints(character.getLifePoints() - enemy.getAttackPoints());
            enemy.setLifePoints(enemy.getLifePoints() - character.getAttackPoints());
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Game Over !");
            menu.launchGame();
        } else {
            System.out.println("Tu as gagné !");
        }
    }
}
