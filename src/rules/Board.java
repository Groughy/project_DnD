package rules;

import java.util.ArrayList;
import java.util.Random;
import rules.cases.EmptyCase;
import rules.cases.ChestCase;
import rules.cases.EnemyCase;

public class Board {
    private ArrayList<Case> board;
    private int size = 64;
    private Random rand = new Random();
    private int index;

    public Board() {
        this.board = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            board.add(randomizeCase(i));
        }
    }
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

    public Case getBoard(int i) {
        return board.get(i);
    }

    public void setBoard(ArrayList<Case> board) {
        this.board = board;
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
    public Case getCase(int index) {
        return board.get(index);
    }

    @Override
    public String toString() {
        return "Board{" +
                "board=" + board +
                ", size=" + size +
                ", rand=" + rand +
                ", index=" + index +
                '}';
    }
}
