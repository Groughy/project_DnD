package rules.cases;

import characters.Job;
import database.DataBase;
import items.consummables.Elixir;
import items.consummables.Potion;
import items.defensives.philtres.ExplosivePhiltre;
import items.defensives.philtres.HealingPhiltre;
import items.defensives.shields.Bulwark;
import items.defensives.shields.Roundache;
import items.offensives.spells.FireBall;
import items.offensives.spells.ThunderBolt;
import items.offensives.weapons.Mace;
import items.offensives.weapons.Sword;
import rules.Case;
import rules.Game;
import rules.interactions.Find;

import java.sql.SQLException;

public class ChestCase implements Find, Case {


    public ChestCase(Job character, DataBase dataBase) throws SQLException {
        getLoot(character, dataBase);
    }

    public void getLoot(Job character, DataBase dataBase) throws SQLException {
        int randomLoot = rand.nextInt(100) + 1;
        if (randomLoot < 50) {
            findPotion(character, dataBase);
        } else if (randomLoot < 80) {
            findOffensiveItem(character, dataBase);
        } else {
            findDefensiveItem(character, dataBase);
        }
    }

    @Override
    public void randomizeCase(Job character, Game game, DataBase dataBase) throws SQLException {

    }

    @Override
    public void findPotion(Job character, DataBase dataBase) throws SQLException {
        if (rand.nextInt(2) == 0) {
            System.out.println("Tu as trouvé une potion de soin.");
            character.drinkPotion(character, new Potion());
        } else {
            System.out.println("Tu as trouvé un élixir.");
            character.drinkPotion(character, new Elixir());
        }
        dataBase.updateLifePoints(character);
    }

    @Override
    public void findOffensiveItem(Job character, DataBase dataBase) throws SQLException {
        if (rand.nextInt(2) == 0) {
            findWeapon(character);
        } else {
            findSpell(character);
        }
        dataBase.updateAttackPoints(character);
    }

    @Override
    public void findWeapon(Job character) {

        if (rand.nextInt(2) == 0) {
            System.out.println("Tu as trouvé une épée.");
            character.equip(character, new Sword());
        } else {
            System.out.println("Tu as trouvé une masse.");
            character.equip(character, new Mace());
        }
    }

    @Override
    public void findShield(Job character) {
        if (rand.nextInt(2) == 0) {
            System.out.println("Tu as trouvé un pavois.");
            character.equip(character, new Bulwark());
        } else {
            System.out.println("Tu as trouvé une rondache.");
            character.equip(character, new Roundache());
        }
    }

    @Override
    public void findSpell(Job character) {
        if (rand.nextInt(2) == 0) {
            System.out.println("Tu as trouvé un sort de boule de feu.");
            character.castSpell(character, new FireBall());
        } else {
            System.out.println("Tu as trouvé un sort de foudre.");
            character.castSpell(character, new ThunderBolt());
        }
    }

    @Override
    public void findDefensiveItem(Job character, DataBase dataBase) throws SQLException {
        if (rand.nextInt(2) == 0) {
            findShield(character);
        } else {
            findPhiltre(character);
        }
        dataBase.updateDefensePoints(character);
    }

    @Override
    public void findPhiltre(Job character) {
        if (rand.nextInt(2) == 0) {
            System.out.println("Tu as trouvé un philtre explosif.");
            character.usePhiltre(character, new ExplosivePhiltre());
        } else {
            System.out.println("Tu as trouvé un philtre de soin.");
            character.usePhiltre(character, new HealingPhiltre());
        }
    }

    @Override
    public String toString() {
        return "ChestCase";
    }
}
