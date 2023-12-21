package practice6;

abstract class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void bark();

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class GoldenRetriever extends Dog {
    public GoldenRetriever(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Golden Retriever barks: Woof-woof!");
    }
}

class Bulldog extends Dog {
    public Bulldog(String name, int age) {
        super(name, age);
    }

    @Override
    public void bark() {
        System.out.println("Bulldog barks: Grrr!");
    }
}

public class DogTest {
    public static void main(String[] args) {
        Dog goldenRetriever = new GoldenRetriever("Baron", 3);
        Dog bulldog = new Bulldog("Rex", 5);

        goldenRetriever.bark();
        bulldog.bark();

        System.out.println("Golden Retriever's name: " + goldenRetriever.getName());
        System.out.println("Bulldog's age: " + bulldog.getAge());
    }
}
