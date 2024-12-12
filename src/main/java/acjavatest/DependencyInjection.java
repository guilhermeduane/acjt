package acjavatest;

import acjavatest.dependencyinjection.Car;
import acjavatest.dependencyinjection.ElectricEngine;
import acjavatest.dependencyinjection.Engine;

public class DependencyInjection {

    public static void main(String[] args) {
        Engine electricEngine = new ElectricEngine();
        Car car = new Car(electricEngine);

        car.drive();
    }
}
