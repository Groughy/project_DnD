package rules.interactions;

import characters.Enemy;
import characters.Job;
import database.DataBase;
import rules.Game;

import java.sql.SQLException;

public interface Fight {

    void fight(Job character, Enemy enemy, DataBase dataBase) throws SQLException;

    void flee(Game game);

    void fightOrFlee(Job character, Enemy enemy, Game game, DataBase dataBase) throws SQLException;
}
