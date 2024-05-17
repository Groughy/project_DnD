package rules;

import characters.Job;
import database.DataBase;

import java.sql.SQLException;
import java.util.Random;

public interface Case {
    Random rand = new Random();

    void randomizeCase(Job character, Game game, DataBase dataBase) throws SQLException;
}
