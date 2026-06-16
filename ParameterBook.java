class Book {
    String title;
    int author;

    Book(String t, int a) {
        title = t;
        author = a;
    }
    void display() {
        System.out.println(title + " " + author);
    }
}
public class ParameterBook {
    public static void main(String[] args) {
        Book book1 = new Book("Java", 500);
        Book book2 = new Book("Python", 600);
        book1.display();
        book2.display();
    }
}
