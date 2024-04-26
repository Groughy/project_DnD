import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu launcher = new Menu();
        while (launcher.launchGame()) {
            Game game = new Game(launcher);
            game.play();
        }
        launcher.display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
    }


}