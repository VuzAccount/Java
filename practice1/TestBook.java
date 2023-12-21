package practice1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book();
        System.out.println("The book created by the default constructor:");
        System.out.println(b1);
        Book b2 = new Book("War and Peace", "Leo Tolstoy");
        System.out.println("The book created by the constructor with partial initialization:");
        System.out.println(b2);
        Book b3 = new Book("Long title", "Famous Author", "Big Publishing House", 15000, 1865);
        System.out.println("A book created by a constructor with all fields:");
        System.out.println(b3);
        try{
            System.out.println("Attempt to change the number of instances to a negative number:");
            b3.setEdition(-12);
        }catch (IllegalArgumentException e){
            System.out.println(e.toString());
        }
        System.out.println("Changing the number of instances to 0:");
        b3.setEdition(0);
        System.out.println(b3);
        System.out.println("Publisher = " + b3.getPublisher());
        System.out.println("Publish Year = " + b3.getPublishYear());
        System.out.println("Changing the number of instances by 100:");
        b3.setEdition(100);
        System.out.println(b3);
        System.out.println("Publisher = " + b3.getPublisher());
        System.out.println("Publish Year = " + b3.getPublishYear());
    }
}