package seminars.second.hw;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class VehicleTest {
    Car car;
    Motorcycle motorcycle;

    @BeforeEach
    void runTests() {
        this.car = new Car("Skoda", "Karoq", 2020);
        this.motorcycle = new Motorcycle("Jawa", "RVM 500", 2020);
    }

    /*
     * Проверяем, что экземпляр объекта Car
     * также является экземпляром Vehicle
     */
    @Test
    void carIsVehicle() {
        assertThat(car instanceof Vehicle);
    }

    /*
     * Проверяет, что объект Car создаётся с 4-мя колёсами
     */
    @Test
    void carHasFourWheels() {
        assertThat(car.getNumWheels() == 4);
    }

    /*
     * Проверяет, что объект Motorcycle создаётся с 2-мя колёсами
     */
    @Test
    void motorcycleHasTwoWheels() {
        assertThat(motorcycle.getNumWheels() == 2);
    }

    /*
     * Проверить, что объект Car развивает скорость 60 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void checkSpeedCar() {
        car.testDrive();

        assertThat(car.getSpeed() == 60);
    }

    /*
     * Проверить, что объект Motorcycle развивает скорость 75 в режиме тестового вождения (используя метод testDrive()).
     */
    @Test
    void checkSpeedMotorcycle() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed() == 75);
    }

    /*
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     * эмуляция движения транспорта) машина останавливается (speed = 0).
     */
    @Test
    void checkSpeedCarAfterParking() {
        car.testDrive();
        car.park();

        assertThat(car.getSpeed() == 0);
    }

    /*
     * Проверить, что в режиме парковки (сначала testDrive, потом park, т.е.
     *  эмуляция движения транспорта) мотоцикл останавливается (speed = 0).
     */
    @Test
    void checkSpeedMotorcycleAfterParking() {
        motorcycle.testDrive();
        motorcycle.park();

        assertThat(motorcycle.getSpeed() == 0);
    }

}