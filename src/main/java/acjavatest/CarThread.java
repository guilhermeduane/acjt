package acjavatest;

public class CarThread extends Thread {
    final String brand;
    final String model;
    final double price;

    public CarThread(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("Hello, my name is " + this.brand + " - " + "My model is " + this.model + " - " + "My price is " + this.price);
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }

    public static void main(String[] args) {
        CarThread audi = new CarThread("Audi", "A4", 9000);
        CarThread bmw = new CarThread("BMW", "M3 E92", 27500);

        audi.start();
        bmw.start();
    }
}
