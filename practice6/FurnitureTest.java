package practice6;

abstract class Furniture {
    private String type;
    private String material;

    public Furniture(String type, String material) {
        this.type = type;
        this.material = material;
    }

    public abstract void use();

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }
}

class Chair extends Furniture {
    public Chair(String material) {
        super("Chair", material);
    }

    @Override
    public void use() {
        System.out.println("Sitting on the chair.");
    }
}

class Table extends Furniture {
    public Table(String material) {
        super("Table", material);
    }

    @Override
    public void use() {
        System.out.println("Placed something on the table.");
    }
}

class FurnitureShop {
    public void sellFurniture(Furniture furniture) {
        System.out.println("Sold furniture: " + furniture.getType() + " made of " + furniture.getMaterial());
        furniture.use();
    }
}

public class FurnitureTest {
    public static void main(String[] args) {
        FurnitureShop shop = new FurnitureShop();
        Furniture chair = new Chair("Wood");
        Furniture table = new Table("Glass");

        shop.sellFurniture(chair);
        shop.sellFurniture(table);
    }
}
