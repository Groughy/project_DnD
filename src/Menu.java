import java.util.Scanner;
import java.util.Random;

public class Menu {
    private int[] board = new int [64];

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

    private Random rand = new Random();
    private int rollDice(){
        return rand.nextInt(5)+1;}
    void play() {
        Character character = new Character();
        character = character.createCharacter();
        System.out.println(character);
        int i = 0;
        while (i < board.length) {
            System.out.println("Press enter to roll the dice");
            new Scanner(System.in).nextLine();
            int dice = rollDice();
            i += dice;
            System.out.println("You got a " + dice);
            System.out.println("You are on the " + i + "th case");
        }
        System.out.println("Bravo, you win !");
        System.out.println("Wanna play again ? (yes/no)(੭ ᵔ³ᵔ)੭ 口");
        Main.wannaPlay();
    }
}
