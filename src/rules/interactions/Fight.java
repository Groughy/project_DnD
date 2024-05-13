package rules.interactions;

import characters.Enemy;
import characters.Job;
import rules.Game;
import java.util.Scanner;

public interface Fight {

    default void fight(Job character, Enemy enemy) {
        while (character.getLifePoints() > 0 && enemy.getLifePoints() > 0) {
            if (enemy.getAttackPoints() >= character.getDefensePoints()) {
                character.setLifePoints((character.getDefensePoints() + character.getLifePoints()) - enemy.getAttackPoints());
            }
            enemy.setLifePoints(enemy.getLifePoints() - character.getAttackPoints());
            System.out.println("Il reste " + enemy.getLifePoints() + " Points de vie à l'adversaire");
        }
        if (character.getLifePoints() <= 0) {
            System.out.println("Game Over !");
            System.exit(0);
        } else {
            System.out.println("Tu as gagné ce combat ! Il te reste " + character.getLifePoints() + " points de vie.");
        }

    }

    default void flee(Game game) {
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

    default void fightOrFlee(Job character, Enemy enemy, Game game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voulez-vous combattre ou fuir ?");
        String input = scanner.nextLine();
        switch (input.toLowerCase()) {
            case "combattre", "c" -> {
                System.out.println("Vous combattez !");
                fight(character, enemy);
            }
            case "fuir", "f" -> {
                System.out.println("Vous fuyez !");
                flee(game);
            }
            default -> System.out.println("Commande invalide");
        }
    }
}
