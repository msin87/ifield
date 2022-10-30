package States;

import Enums.ELevel;
import Interfaces.State;

public class TrueState implements State {
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
}
