import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main launcher = new Main();
        launcher.launchGame();
    }

    private void launchGame() {
        System.out.println("Welcome to the game! (•̀ᴗ•́)و ̑̑");
        System.out.println("Wanna play ? (yes/no) (੭ ᵔ³ᵔ)੭ 口");
        wannaPlay();
    }

    static void wannaPlay() {
        switch(new Scanner(System.in).nextLine()) {
            case "yes", "Yes", "y","Y","": Menu game = new Menu();
                game.play();
                break;
            case "no", "No", "n", "N": System.out.println("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
                break;
        }
    }
}