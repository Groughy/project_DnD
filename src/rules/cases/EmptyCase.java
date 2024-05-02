package rules.cases;

import rules.Case;


public class EmptyCase implements Case {
    public EmptyCase() {
        System.out.println("Il n'y a rien ici, tu peux suivre ta route.");
    }

    @Override
    public String toString() {
        return "EmptyCase";
    }
}
