package rules;

import characters.Character;

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

    void play() {
        Character character = menu.createCharacter();
        menu.display(character);
        int i = 0;
        while (i < board.length) {
            menu.askToRoll();
            int dice = rollDice();
            i += dice;
            menu.display("You got a " + dice);
            menu.display("You are on the " + i + "th case");
        }
        menu.display("Bravo, you win !");
    }
    public Random getRand() {
        return rand;
    }

    public void setRand(Random rand) {
        this.rand = rand;
    }

    public int[] getBoard() {
        return board;
    }

    public void setBoard(int[] board) {
        this.board = board;
    }
}
