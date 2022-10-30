package Enums;

public enum ELevel {
    FALSE(-1),
    UNDEFINED(0),
    TRUE(1),
    NULL(2);
    private final int number;
    ELevel(int i) {
        this.number =i;
    }
    public int getNumber(){
        return number;
    }

}
