package rules;

import exceptions.CharacterOutofBoundsException;
import java.util.Random;

public class Game {
    private int[] board = new int[64];
    private Random rand = new Random();
    private final Menu menu;

    public Game(Menu menu) {
        this.menu = menu;
    }

    private int rollDice() {
        return rand.nextInt(5) + 1;
    }

    void play() throws CharacterOutofBoundsException {
        String name = menu.askName();
        Menu character = menu.createCharacter(name);
        menu.display(character);
        turnBoard();
    }

    private void turnBoard() throws CharacterOutofBoundsException {
        int i = 0;
        while (i < board.length) {
            menu.askToRoll();
            int dice = rollDice();
            i += dice;
            menu.display("You got a " + dice);
            menu.display("You are on the " + i + "th case");
            try {
                if (i > board.length) {
                    throw new CharacterOutofBoundsException ();
                }
            } catch (CharacterOutofBoundsException e) {
                menu.display("You can't go further than the 64th case");
                break;
            }
        }
        menu.display("Bravo, you win !");
    }
}
