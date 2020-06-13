import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {


    @Test
    void multipleConditionsTest() {
        //(angle>=0 && angle<360)
        //T || F
        //F || T
        //T || T

        RuntimeException ex;

        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function((361,0,0)));
        assertTrue(ex.getMessage().contains("The angle is smaller or greater then the minimum"));

        ex = assertThrows(RuntimeException.class,
                () -> SILab2.function((360,1,0)));
        assertTrue(ex.getMessage().contains("The angle is greater then the minimum"));

    }


}
