package States;

import Enums.ELevel;
import Interfaces.State;

public class UndefinedState implements State {
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

    }
}
