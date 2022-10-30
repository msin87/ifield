package Logic;

import Interfaces.State;

public class Logic {
    private Logic() {

    }
    public State sum (State currentState, State neighborState){
    switch (currentState.getState()){
        case FALSE:{
            switch (neighborState.getState()){
                case FALSE:{
                    neighborState.setPower(neighborState.getPower()*2);
                }
                case UNDEFINED:{

                }
                case TRUE:{

                }
                case NULL:{

                }
            }
        };
        case 0: {

        }
        case 1:{

        }
        default:
    }
    }
}
