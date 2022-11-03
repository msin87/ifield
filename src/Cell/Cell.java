package Cell;

import Interfaces.LogicState;
import States.FalseLogicState;
import States.TrueLogicState;

public class Cell {
    private LogicState False;
    private LogicState True;
    private boolean isNull;

    public Cell(FalseLogicState False, TrueLogicState True) {
        this.False = False;
        this.True = True;
        this.isNull = false;
    }
    public void setNull(boolean nullState){
        this.isNull = nullState;
    }
    public boolean isNull(){
        return this.isNull;
    }
    public LogicState getFalse(){
        return False;
    }

    public LogicState getTrue() {
        return True;
    }
    private int addToMax(int num1, int num2){
        int result;
        try {
            result = Math.addExact(num1,num2);
        }
        catch (ArithmeticException exception){
            result = Integer.MAX_VALUE;
        }
        return result;
    }
    private int subToZero(int num1, int num2){
        int result=0;
        if (num1>0){
            result=Math.max(0,num1-num2);
        }
        else if (num1<0){
            result=Math.min(0,num1-num2);
        }
        return result;
    }
    public void subtractPowerFromLogicState(boolean logicState, int power){
        if (logicState){
            this.True.setPower(subToZero(this.True.getPower(),power));
        }
        else {
            this.False.setPower(subToZero(this.False.getPower(),power));
        }
    }
    public void addPowerToLogicState(boolean logicState, int power){
        if (logicState){
            this.True.setPower(addToMax(this.True.getPower(),power));
        }
        else {
            this.False.setPower(addToMax(this.False.getPower(),power));
        }
    }

}
