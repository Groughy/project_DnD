package rules;

import java.util.Random;
import rules.cases.EmptyCase;
import rules.cases.ChestCase;
import rules.cases.EnemyCase;

public class Board {

    private int size;
    private Random rand = new Random();

    public Board(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }


}
