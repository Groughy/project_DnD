package rules;

import characters.Job;
import exceptions.CharacterOutofBoundsException;

public class Game implements Case{

    private Board board = new Board(64);
    private Menu menu;

    public Game(Menu menu) {
        this.menu = menu;
    }

    private int rollDice() {
        return rand.nextInt(5) + 1;
    }

    void play() {
        String name = menu.askName();
        Job character = menu.getJobByName();
        displayCharacter(name, character);
        turnBoard(board, character);
    }

    private void displayCharacter(String name, Job character) {
        System.out.println(name + " is a " + character.getClass().getSimpleName() + " with "  + character.getLifePoints() + " life points, " + character.getAttackPoints() + " attack points, and is equipped with a " + character.getWeapon().getName() + ".");
    }

    private void turnBoard(Board board, Job character){
        int playerPosition = 0;
        while (playerPosition < board.getSize()) {
            menu.askToRoll();
            int dice = rollDice();
            playerPosition += dice;
            try {
                if (playerPosition >= board.getSize()) {
                    throw new CharacterOutofBoundsException ();
                }
                menu.display("You got a " + dice);
                menu.display("You are on the " + playerPosition + "th case");
                randomizeCase(character);
            } catch (CharacterOutofBoundsException e) {
                menu.display("You can't go further than the 63th case");
                break;
            }
        }
        menu.display("Bravo, you win !");
    }
}