import org.junit.jupiter.api.Test;
import UnitTestCourse.Homework2.Car;
import UnitTestCourse.Homework2.Motorcycle;
import UnitTestCourse.Homework2.Vehicle;

import static org.assertj.core.api.Assertions.*;

    public class VehicleTest {
        
        @Test
        void carInstance() {
            Car car = new Car("Ford", "Shelby GT", 1967);
            assertThat(car).isInstanceOf(Vehicle.class);
        }

        @Test
        void carNumWheels() {
            Car car = new Car("Ford", "Shelby GT", 1967);
            assertThat(car.getNumWheels()).isEqualTo(4);
        }

        @Test
        void motorcycleNumWheels() {
            Motorcycle motorcycle = new Motorcycle("Honda", "NC750", 2021);
            assertThat(motorcycle.getNumWheels()).isEqualTo(2);
        }

        @Test
        void carTestDrive() {
            Car car = new Car("Ford", "Shelby GT", 1967);
            car.testDrive();
            assertThat(car.getSpeed()).isEqualTo(60);
        }

        @Test
        void motorcycleTestDrive() {
            Motorcycle motorcycle = new Motorcycle("Honda", "NC750", 2021);
            motorcycle.testDrive();
            assertThat(motorcycle.getSpeed()).isEqualTo(75);
        }

        @Test
        void carTestPark() {
            Car car = new Car("Ford", "Shelby GT", 1967);
            car.testDrive();
            car.park();
            assertThat(car.getSpeed()).isEqualTo(0);
        }

        @Test
        void motorcycleTestPark() {
            Motorcycle motorcycle = new Motorcycle("Honda", "NC750", 2021);
            motorcycle.testDrive();
            motorcycle.park();
            assertThat(motorcycle.getSpeed()).isEqualTo(0);
        }
    }