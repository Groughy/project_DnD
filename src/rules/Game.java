package rules;

import characters.Job;
import exceptions.CharacterOutofBoundsException;
import rules.interactions.Fight;

public class Game implements Case, Fight {

    private Board board = new Board(64);
    private Menu menu;
    private int playerPosition = 0;

    public int getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(int playerPosition) {
        this.playerPosition = playerPosition;
    }

    public Game(Menu menu) {
        this.menu = menu;
    }

    private int rollDice() {
        return rand.nextInt(5) + 1;
    }

    void play(Game game) {
        String name = menu.askName();
        Job character = menu.getJobByName();
        displayCharacter(name, character);
        turnBoard(board, character, game);
    }

    private void displayCharacter(String name, Job character) {
        System.out.println(name + " is a " + character.getClass().getSimpleName() + " with "  + character.getLifePoints() + " life points, " + character.getAttackPoints() + " attack points, and is equipped with a " + character.getWeapon().getName() + ".");
    }

    private void turnBoard(Board board, Job character, Game game){

        while (playerPosition < board.getSize()) {
            menu.askToRoll();
            int dice = rollDice();
            playerPosition += dice;
            try {
                if (playerPosition >= board.getSize()) {
                    throw new CharacterOutofBoundsException ();
                }
                menu.display("Tu as obtenu un " + dice);
                menu.display("Tu es à la " + playerPosition + " ème case.");
                randomizeCase(character, game);
            } catch (CharacterOutofBoundsException e) {
                menu.display("T'es au bout du tableau !");
                break;
            }
        }
        menu.display("Bravo, tu as fini le jeu ! Merci d'avoir joué !");
    }

}