package rules;
import database.DataBase;
import java.sql.SQLException;

public class Main{
    public static void main(String[] args) throws SQLException {
        Menu launcher = new Menu();
        Game game = new Game(launcher);
        DataBase dataBase = new DataBase();
        while (launcher.launchGame()) {
            launcher.display("Welcome to the game! (•̀ᴗ•́)و ̑̑");
            game.play(game, dataBase);
        }
        launcher.display("Go to hell ! █▬▬ ◟(`ﮧ´ ◟ )");
    }
}