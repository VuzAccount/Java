package practice3;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Ben Mark", "ben.mark@aboba.com", 'M');
        System.out.println(a1);
        Author a2 = new Author("Floyd Black", "bloyd.black@aboba.com", 'U');
        a2.setEmail("i_love_mirea@gmail.com");
        System.out.println(a2);
    }
}
