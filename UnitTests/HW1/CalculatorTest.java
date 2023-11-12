
import static org.assertj.core.api.Assertions.*;
import static Calculator.Calculator.*;

    public class CalculatorTest {
        public static void main(String[] args) {
            // Проверка базового функционала с целыми числами:
            if (8 != Calculator.calculation(2, 6, '+')) {
                throw new AssertionError("Ошибка в методе");
            }

            if (0 != Calculator.calculation(2, 2, '-')) {
                throw new AssertionError("Ошибка в методе");
            }

            if (14 != Calculator.calculation(2, 7, '*')) {
                throw new AssertionError("Ошибка в методе");
            }

            if (2 != Calculator.calculation(100, 50, '/')) {
                throw new AssertionError("Ошибка в методе");
            }

            // Случаи с неправильными аргументами
            // аргумент operator типа char, должен вызывать исключение, если он получает не базовые символы (+-*/)
            // try {
            //     seminars.first.Calculator.Calculator.calculation(8, 4, '_');
            // } catch (IllegalStateException e) {
            //     if (!e.getMessage().equals("Unexpected value operator: _")) {
            //         throw new AssertionError("Ошибка в методе");
            //     }
            // }

            // Проверка базового функционала с целыми числами, с использованием утверждений:
            assert 8 == Calculator.calculation(2, 6, '+');
            assert 0 == Calculator.calculation(2, 2, '-');
            assert 14 == Calculator.calculation(2, 7, '*');
            assert 2 == Calculator.calculation(100, 50, '/');

            // Проверка базового функционала с целыми числами, с использованием утверждений AssertJ:
//        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
//        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
//        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
//        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

            // Проверка ожидаемого исключения, с использованием утверждений AssertJ:
//        assertThatThrownBy(() -> Calculator.calculation(8, 4, '_')).isInstanceOf(IllegalStateException.class);

            System.out.println(Calculator.calculation(2_147_483_647, 1, '+')); // integer overflow
            System.out.println(squareRootExtraction(169));

            // Тесты для функции извлечения корня squareRootExtraction
            assertThat(squareRootExtraction(0)).isEqualTo(0); //корень из нуля
            assertThat(squareRootExtraction(49)).isEqualTo(7); //корень из 49
            assertThat(squareRootExtraction(12)).isEqualTo(3.46, offset(0.01)); //корень из 12
            assertThatThrownBy(() -> squareRootExtraction(-4)).isInstanceOf(IllegalArgumentException.class); //корень из отрицательного числа

            // Тесты для calculatingDiscount
            assertThat(calculatingDiscount(200, 75)).isEqualTo(150);
            assertThat(calculatingDiscount(250, 0)).isEqualTo(250);
            assertThat(calculatingDiscount(135, 100)).isEqualTo(0);
            assertThatThrownBy(() -> calculatingDiscount(99, -15)).isInstanceOf(ArithmeticException.class);
            assertThatThrownBy(() -> calculatingDiscount(333, 115)).isInstanceOf(ArithmeticException.class);

        }
    }

