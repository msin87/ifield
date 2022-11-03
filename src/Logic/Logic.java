package Logic;

import Cell.Cell;
import Interfaces.LogicState;

public class Logic {
    private final Cell[] cellArray;

    public Logic(Cell currentCell, Cell neighborCell) {
        cellArray = new Cell[2];
        cellArray[0]=currentCell;
        cellArray[1]=neighborCell;
    }

    public Logic sendSignalToNeighborCell (){
        cellArray[1].addPowerToLogicState (true,cellArray[0].getTrue().getPower()/2);
        cellArray[0].subtractPowerFromLogicState(true,cellArray[0].getTrue().getPower()/2);
        cellArray[1].addPowerToLogicState (false,cellArray[0].getTrue().getPower()/2);
        cellArray[0].subtractPowerFromLogicState(false,cellArray[0].getTrue().getPower()/2);
        return this;
    }

}
