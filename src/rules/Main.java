package rules;

public class Main{
    public static void main(String[] args){
        Menu launcher = new Menu();
        Game game = new Game(launcher);
        while (launcher.launchGame()) {
            launcher.display("Welcome to the game! (•̀ᴗ•́)و ̑̑");
            game.play(game);
        }
        launcher.display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
    }
}