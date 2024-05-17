package rules.cases;

import characters.Enemy;
import characters.Job;
import characters.enemies.Dragon;
import characters.enemies.Goblin;
import characters.enemies.Warlock;
import database.DataBase;
import rules.Game;
import rules.interactions.Fight;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class EnemyCase implements Fight {

    public EnemyCase(Job character, Game game, DataBase dataBase)throws SQLException {
        getEnemy(character, game, dataBase);
    }

    public void getEnemy(Job character, Game game, DataBase dataBase) throws SQLException {
        Random rand = new Random();
        int randomEnemy = rand.nextInt(100) + 1;
        if (randomEnemy < 70) {
            System.out.println("Tu as trouvé un gobelin.");
            fightOrFlee(character, new Goblin(), game, dataBase);
        } else if (randomEnemy < 90) {
            System.out.println("Tu as trouvé un sorcier.");
            fightOrFlee(character, new Warlock(), game, dataBase);
        } else {
            System.out.println("Tu as trouvé un dragon.");
            fightOrFlee(character, new Dragon(), game, dataBase);
        }
    }

    @Override
    public void fight(Job character, Enemy enemy, database.DataBase dataBase) throws SQLException {
        while (character.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
            if (enemy.getAttackPoints() >= character.getDefensePoints()) {
                character.setLifePoints((character.getDefensePoints() + character.getLifePoints()) - enemy.getAttackPoints());
            }
            enemy.setLifePoints(enemy.getLifePoints() - character.getAttackPoints());
            System.out.println("Il reste " + enemy.getLifePoints() + " Points de vie à l'adversaire");
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Tu as été battu !");
        } else {
            System.out.println("Tu as gagné ce combat ! Il te reste " + character.getLifePoints() + " points de vie.");
            dataBase.updateLifePoints(character);
        }
    }

    @Override
    public void flee(Game game) {
        System.out.println("Vous essayez de fuir !");
        if (Math.random() < 0.8) {
            int back = (int) (Math.random() * 6) + 1;
            game.setPlayerPosition(game.getPlayerPosition() - back);
            System.out.println("Vous reculez de " + back + " cases.");
            System.out.println("Tu es à la " + game.getPlayerPosition() + " ème case.");

        } else {
            System.out.println("Vous n'arrivez pas à fuir");
        }
    }

    @Override
    public void fightOrFlee(Job character, Enemy enemy, Game game, DataBase dataBase) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous combattre ou fuir ?");
        String input = scanner.nextLine();
        switch (input.toLowerCase()) {
            case "combattre", "c" -> {
                System.out.println("Vous combattez !");
                fight(character, enemy, dataBase);
            }
            case "fuir", "f" -> {
                System.out.println("Vous fuyez !");
                flee(game);
            }
            default -> System.out.println("Commande invalide");
        }
    }
}
