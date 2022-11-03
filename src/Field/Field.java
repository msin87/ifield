package Field;

import Cell.Cell;
import States.FalseLogicState;
import States.TrueLogicState;

import java.util.LinkedList;
import java.util.concurrent.ThreadLocalRandom;

public class Field {
    private LinkedList<LinkedList<Cell>> field = new LinkedList<>();
    private int max_rows;
    private int max_cols;
    private int maxInitPower;
    private int minInitPower;

    private void initField() {
        for (int r = 0; r < max_rows; r++) {
            LinkedList<Cell> cols = new LinkedList<>();
            for (int c = 0; c < max_cols; c++) {
                cols.add(new Cell(
                        new FalseLogicState(ThreadLocalRandom.current().nextInt(minInitPower, maxInitPower)),
                        new TrueLogicState(ThreadLocalRandom.current().nextInt(minInitPower, maxInitPower))
                ));
            }
            field.add(cols);
        }
    }
    public boolean putLightIntoPosition(int x, int y){
        return true;
    }
    public void tic() {
        for (int r = 0; r < max_rows; r++) {
            LinkedList<Cell> upperRow = new LinkedList<>();
            LinkedList<Cell> lowerRow = new LinkedList<>();
            if (r>1)
                upperRow = field.get(r-1);
            if (r<max_rows-1)
                lowerRow=field.get(r+1);
            LinkedList<Cell> currentRow = field.get(r);

            for (int c = 0; c < max_cols; c++){
                Cell currentCell = field.get(r).get()
            }
        }
    }

    public Field(int max_rows, int max_cols, int maxInitPower, int minInitPower) {
        this.max_rows = max_rows;
        this.max_cols = max_cols;
        this.maxInitPower = maxInitPower;
        this.minInitPower = minInitPower;
        initField();
    }
}
