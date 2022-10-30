package States;

import Enums.ELevel;
import Interfaces.State;

public class FalseState implements State {
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

    public FalseState(int power) {
        this.power = power;
    }
}
