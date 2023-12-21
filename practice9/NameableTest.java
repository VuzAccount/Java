package practice9;

// Интерфейс Nameable
interface Nameable {
    String getName();
}

// Классы, реализующие интерфейс Nameable
class Planet implements Nameable {
    private String name;

    public Planet(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

class Animal implements Nameable {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}

public class NameableTest {
    public static void main(String[] args) {
        Nameable earth = new Planet("Earth");
        Nameable lion = new Animal("Lion");

        System.out.println("Name of the planet: " + earth.getName());
        System.out.println("Name of the animal: " + lion.getName());
    }
}
