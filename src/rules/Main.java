package rules;

public class Main {
    public static void main(String[] args){
        Menu launcher = new Menu();
        while (launcher.launchGame()) {
            Game game = new Game(launcher);
            launcher.display("Welcome to the game! (•̀ᴗ•́)و ̑̑");
            game.play();
        }
        launcher.display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
    }
}