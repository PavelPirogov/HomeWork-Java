import UnitTestCourse.Homework03.MainHW;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW3Test1 {
    @ParameterizedTest
    @ValueSource(ints = {4, 10,88,120})
    void evenNum(int n) {
        assertTrue(MainHW.evenOddNum(n));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 11, 21, 99})
    void notEvenNum(int n) {
        assertFalse(MainHW.evenOddNum(n));
    }
}

