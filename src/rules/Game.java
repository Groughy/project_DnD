package rules;

import characters.Job;
import exceptions.CharacterOutofBoundsException;
import rules.cases.ChestCase;
import rules.cases.EmptyCase;
import rules.cases.EnemyCase;
import database.DataBase;

import java.sql.SQLException;

public class Game implements Case {

    private Board board = new Board(64);
    private Menu menu;
    private int playerPosition = 0;

    /**
     * @return the playerPosition
     */

    public int getPlayerPosition() {
        return playerPosition;
    }
    /**
     * @param playerPosition the playerPosition to set
     */

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Game(Menu menu) {
        this.menu = menu;
    }

    private int rollDice() {
        return rand.nextInt(5) + 1;
    }

    void play(Game game, DataBase dataBase) throws SQLException {
        Job character = menu.getJobByName();
        String name = menu.askName(character);
        dataBase.createNewHero(character, name);
        dataBase.getHero();
        displayCharacter(character);
        turnBoard(board, character, game, dataBase);
    }

    private void displayCharacter( Job character) {
        System.out.println(character.getName() + " is a " + character.getNameCharacter() + " with " + character.getLifePoints() + " life points, " + character.getAttackPoints() + " attack points, and is equipped with a " + character.getWeapon().getName() + ".");
    }

    private void turnBoard(Board board, Job character, Game game, DataBase dataBase) throws SQLException {
        playerPosition = 0;
        while (playerPosition < board.getSize() || character.getLifePoints() > 0){
            if (character.getLifePoints() <= 0){
                menu.display("Game Over !");
                menu.launchGame();
            }
            menu.askToRoll();
            int dice = rollDice();
            playerPosition += dice;
            try {
                if (playerPosition >= board.getSize()) {
                    throw new CharacterOutofBoundsException();
                }
                menu.display("Tu as obtenu un " + dice);
                menu.display("Tu es à la " + playerPosition + " ème case.");
                randomizeCase(character, game, dataBase);
            } catch (CharacterOutofBoundsException e) {
                menu.display("T'es au bout du tableau !");
                break;
            }
        }
        menu.display("Bravo, tu as fini le jeu ! Merci d'avoir joué !");
    }

    @Override
    public void randomizeCase(Job character, Game game, DataBase dataBase) throws SQLException {
        int position = rand.nextInt(100);
        if (position < 30) {
            new EnemyCase(character, game, dataBase);
        } else if (position < 50) {
            new ChestCase(character, dataBase);
        } else {
            new EmptyCase();
        }
    }
}