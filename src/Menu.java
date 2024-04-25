import java.util.Scanner;
import java.util.Random;

public class Menu {
    private int[] board = new int [64];
    private Random rand = new Random();
    private int rollDice(){
        return rand.nextInt(5)+1;}
    public static void main(String[] args) {
        System.out.println("Welcome to the game! (•̀ᴗ•́)و ̑̑");
        System.out.println("Wanna play ? (yes/no) (੭ ᵔ³ᵔ)੭ 口");
        if (new Scanner(System.in).nextLine().equals("yes")) {
            Menu game = new Menu();
            game.play();
        }
        else {
            System.out.println("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
        }
    }
    private void play() {
        Character.main(null);
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
        if (new Scanner(System.in).nextLine().equals("yes")) {
            Menu game = new Menu();
            game.play();
        }
        else {
            System.out.println("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
        }
    }
}
