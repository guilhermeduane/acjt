package acjavatest.dependencyinjection;

public class ElectricEngine implements Engine {
    @Override
    public void start() {
        System.out.println("Electric engine starting...");
    }
}