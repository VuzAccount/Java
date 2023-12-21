package practice9;

// Интерфейс Priceable
interface Priceable {
    double getPrice();
}

// Классы, реализующие интерфейс Priceable
class Car implements Priceable {
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Laptop implements Priceable {
    private double price;

    public Laptop(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}

public class PriceableTest {
    public static void main(String[] args) {
        Priceable audi = new Car(50000.0);
        Priceable macbook = new Laptop(1500.0);

        System.out.println("Car price: $" + audi.getPrice());
        System.out.println("Laptop price: $" + macbook.getPrice());
    }
}
