package States;

import Enums.ELevel;
import Interfaces.LogicState;

public class TrueLogicState implements LogicState {
    private int power;

    @Override
    public ELevel getState() {
        return ELevel.TRUE;
    }
    @Override
    public int getPower() {
        return power;
    }
    @Override
    public void setPower(int power) {
        this.power = power;
    }
    public TrueLogicState(int power) {
        this.power = -power;
    }
}
