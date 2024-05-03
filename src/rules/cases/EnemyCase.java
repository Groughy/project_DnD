package rules.cases;

import characters.Enemy;
import characters.Job;
import characters.enemies.Dragon;
import characters.enemies.Goblin;
import characters.enemies.Warlock;
import rules.Case;

public class EnemyCase implements Case {


    public EnemyCase(Job character) {
        getEnemy(character);
    }

    public void getEnemy(Job character) {
        int randomEnemy = rand.nextInt(100) + 1;
        if (randomEnemy < 70) {
            System.out.println("Tu as trouvé un gobelin.");
            fight(character, new Goblin());
        } else if (randomEnemy < 90) {
            System.out.println("Tu as trouvé un sorcier.");
            fight(character, new Warlock());
        } else {
            System.out.println("Tu as trouvé un dragon.");
            fight(character, new Dragon());
        }
    }

    @Override
    public String toString() {
        return "EnemyCase";
    }

    public void fight(Job character, Enemy enemy) {
        while (character.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
            character.setLifePoints((character.getDefensePoints()+character.getLifePoints()) - enemy.getAttackPoints());
            enemy.setLifePoints(enemy.getLifePoints() - character.getAttackPoints());
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Game Over !");
            System.exit(0);
        } else {
            System.out.println("Tu as gagné ce combat ! Il te reste " + character.getLifePoints() + " points de vie.");
        }
    }
}
