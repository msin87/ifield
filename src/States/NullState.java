package States;

import Enums.ELevel;
import Interfaces.State;

public class NullState implements State {
    private int power = 0;
    @Override
    public ELevel getState() {
        return ELevel.NULL;
    }

    @Override
    public int getPower() {
        return 0;
    }

    @Override
    public void setPower(int power) {
        this.power = power;
    }
}
