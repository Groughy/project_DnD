package rules.interactions;

import characters.Job;
import database.DataBase;

import java.sql.SQLException;

public interface Find {
    void findPotion(Job character, DataBase dataBase) throws SQLException;

    void findOffensiveItem(Job character, DataBase dataBase) throws SQLException;

    void findWeapon(Job character);

    void findShield(Job character);

    void findSpell(Job character);

    void findDefensiveItem(Job character, DataBase dataBase) throws SQLException;

    void findPhiltre(Job character);
}
