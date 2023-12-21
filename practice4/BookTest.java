package practice4;

class Book {
    private String author;
    private String title;
    private int year;

    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("Alexander Pushkin", "Eugene Onegin", 1833);

        System.out.println("Author: " + book.getAuthor());
        System.out.println("Title: " + book.getTitle());
        System.out.println("Year of Writing: " + book.getYear());

        book.setTitle("Dubrovsky");
        System.out.println("New Title: " + book.getTitle());
    }
}
