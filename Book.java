/** A class modeling a book. */
public class Book {
    String title;
    String author;


    /** Create a new book with title b. */
    public Book(String t, String a) {
        title= t;
        author = a;
    }

    /** Create a new book with author. */


    /** Print this book. */
    public void printBook() {
        System.out.println(title);
        System.out.println(author);
    }

    /** Some book examples. */
    public static void main(String[] args) {
        Book b = new Book("A Clockwork Orange", "Anthony Burgess");
        b.printBook();
    }
}
