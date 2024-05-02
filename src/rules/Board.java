package rules;

import java.util.ArrayList;
import java.util.Random;
import rules.cases.EmptyCase;
import rules.cases.ChestCase;
import rules.cases.EnemyCase;

public class Board {
    private ArrayList<Case> board;
    private int size;
    private Random rand = new Random();

    public Board(int size) {
        this.size = size;
        this.board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            board.add(randomizeCase(i));
        }
    }

    public int getSize() {
        return size;
    }

    public Case randomizeCase(int position) {
        int randomNum = rand.nextInt(100);
        if (randomNum < 30) {
            return new EnemyCase();
        } else if (randomNum < 50) {
            return new ChestCase();
        } else {
            return new EmptyCase();
        }
    }
}
