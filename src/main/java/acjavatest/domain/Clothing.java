package acjavatest.domain;

public class Clothing extends Product {
    private final int size;
    private final String material;

    public Clothing(String name, String desc, double price, int size, String material) {
        super(name, desc, price);
        this.size = size;
        this.material = material;
    }

    @Override
    public String toString() {
        return super.toString() + " _ " + size + " _ " + material;
    }
}
