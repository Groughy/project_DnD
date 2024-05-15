package rules.cases;

import characters.Job;
import rules.Case;
import rules.Game;


public class EmptyCase implements Case {
    public EmptyCase() {
        System.out.println("Il n'y a rien ici, tu peux suivre ta route.");
    }

    @Override
    public String toString() {
        return "EmptyCase";
    }

    @Override
    public void randomizeCase(Job character, Game game) {

    }
}
