import UnitTestCourse.Homework03.MainHW;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HW3Test2 {

        @ParameterizedTest
        @ValueSource(ints = {31, 44, 50, 99})
        void inInterval(int n) {
            assertTrue(MainHW.numInInterval(n));
        }

        @ParameterizedTest
        @ValueSource(ints = {5, 25, 100, 200})
        void notInInterval(int n) {
            assertFalse(MainHW.numInInterval(n));
        }
    }

