package rules;

import exceptions.CharacterOutofBoundsException;

public class Main {
    public static void main(String[] args) throws CharacterOutofBoundsException {
        Menu launcher = new Menu();
        while (launcher.launchGame()) {
            Game game = new Game(launcher);
            launcher.display("Welcome to the game! (•̀ᴗ•́)و ̑̑");
            game.play();
        }
        launcher.display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
    }
}