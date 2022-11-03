package Interfaces;

import Enums.ELevel;

public interface LogicState {
    ELevel getState();
    int getPower();
    void setPower(int power);
}
