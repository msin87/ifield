package Interfaces;

import Enums.ELevel;

public interface State {
    ELevel getState();
    int getPower();
    void setPower(int power);
}
