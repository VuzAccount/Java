package practice6;

abstract class Dish {
    private String material;
    private String color;

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public abstract void use();

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}

class Plate extends Dish {
    public Plate(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Using the plate for food.");
    }
}

class Cup extends Dish {
    public Cup(String material, String color) {
        super(material, color);
    }

    @Override
    public void use() {
        System.out.println("Using the cup for beverages.");
    }
}

public class DishTest {
    public static void main(String[] args) {
        Dish plate = new Plate("Ceramic", "White");
        Dish cup = new Cup("Glass", "Transparent");

        plate.use();
        cup.use();

        System.out.println("Plate material: " + plate.getMaterial());
        System.out.println("Cup color: " + cup.getColor());
    }
}
