package acjavatest.dependencyinjection;

public class Car {

    private final Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void drive() {
        engine.start();
        System.out.println("Driving the car...");
    }
}