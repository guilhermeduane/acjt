package acjavatest.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private String name;
    private String description;
    private double price;

    public final double getPriceWithTax() {
        return price * 1.19;
    }

    @Override
    public String toString() {
        return name + " _ " + description + " _ " + price + " EUR";
    }
}

