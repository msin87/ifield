package States;

import Enums.ELevel;
import Interfaces.LogicState;

public class UndefinedLogicState implements LogicState {
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
