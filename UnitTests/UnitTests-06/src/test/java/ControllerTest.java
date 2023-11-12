import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class ControllerTest {

    int[] array;
    double averageArray;
    double averageArray1;
    Controller controllerMock;

    @BeforeEach
    void setUp() {
        array = new int[]{1, 1, 1, 1, 1};
        averageArray = 1.0;
        averageArray1 = 2.0;
        controllerMock = mock(Controller.class);
    }

    /**
     * Mock-тест - проверка, что в контроллере при вызове метода сравнения средних
     * значений возвращается корректное значение averageArray
     */
    @Test
    void averageArray() {
        when(controllerMock.averageArray(array)).thenReturn(averageArray);
    }

    /**
     * Mock-тест - проверка корректности сравнения средних значений массивов
     */
    @Test
    void compareArray() {
        controllerMock.compareArray(averageArray, averageArray1);
        verify(controllerMock, times(1)).compareArray(averageArray, averageArray1);
    }

    /**
     * Mock-тест - проверка создания в контроллере нового массива с заданными значениями
     */
    @Test
    void createArray() {
        when(controllerMock.createArray()).thenReturn(array);
    }
}
