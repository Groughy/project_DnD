import java.util.Scanner;

public class Main {
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
}