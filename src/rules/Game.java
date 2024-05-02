package rules;

import characters.Job;
import exceptions.CharacterOutofBoundsException;


import java.util.Random;

public class Game {

    private Board board = new Board(64);
    private Random rand = new Random();
    private final Menu menu;

    public Game(Menu menu) {
        this.menu = menu;
    }

    private int rollDice() {
        return rand.nextInt(5) + 1;
    }

    void play() {
        Menu menu = new Menu();
        String name = menu.askName();
        Job character = new Job(menu);
        character =  character.createCharacter();
        menu.display(character);
        turnBoard(board);
    }
    private void turnBoard(Board board){
        int playerPosition = 0;
        while (playerPosition < board.getSize()) {
            menu.askToRoll();
            int dice = rollDice();
            playerPosition += dice;
            try {
                if (playerPosition >= board.getSize()) {
                    throw new CharacterOutofBoundsException ();
                }
                Case currentCase = board.getBoard(playerPosition);
                menu.display("You got a " + dice);
                menu.display("You are on the " + playerPosition + "th case");
                board.randomizeCase(playerPosition);
            } catch (CharacterOutofBoundsException e) {
                menu.display("You can't go further than the 63th case");
                break;
            }
        }
        menu.display("Bravo, you win !");
    }
}