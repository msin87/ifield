package test;

import org.junit.jupiter.api.Test;
import Field.Field;
import static org.junit.jupiter.api.Assertions.*;

public class TicTest {
    @Test
    void tickTest (){
        Field field = new Field(1,10,10,1);
        field.tic();
    }
}
