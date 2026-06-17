class Book{
    String title;
    String author;
    Book(String t, String a){
        title = t;
        author = a;
    }
    Book(Book b){
        this.title = b.title;
        this.author = b.author;
    }
    void display(){
        System.out.println(title + " by " + author);
    }
}
public class CopyConstructorBook {
    public static void main(String[] args) {
        Book book1 = new Book("The Great KingKong", "N. Nantha Kishore");
        Book book2 = new Book(book1);
        book2.author="Sivaranjani S.S";
        book1.display();
        book2.display();
    }
}
