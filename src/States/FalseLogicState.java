package States;

import Enums.ELevel;
import Interfaces.LogicState;

public class FalseLogicState implements LogicState {
    private int power;
    @Override
    public ELevel getState() {
        return ELevel.FALSE;
    }

    @Override
    public int getPower() {
        return power;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }

    public FalseLogicState(int power) {
        this.power = -power;
    }
}
