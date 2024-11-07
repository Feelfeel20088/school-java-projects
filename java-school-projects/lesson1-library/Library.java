import java.util.ArrayList; 
package booklib;

public class Library {
    ArrayList<Book> bookArray = new ArrayList<>();
    // singleton for only one instence
    private static Library instance; 
    
    public static Library getInstance() {
        if (Library.instance == null) {
            Library.instance = new Library();
        }
        return Library.instance;
    }
    private Library() {}

    public void addBook(String title, String author, int year) {
        bookArray.add(new Book(title, author, year));
    }

    public void displayBooks() {
        for (Book book : bookArray) {
            System.out.print(book.getTitle() + "\n");
        }
        System.out.print("\n");
    }

    public Book searchByTitle(String title) {
        String title = title.toLowerCase();
        for (Book book : bookArray) {
            if (book.getTitle().toLowerCase().equals(title)) {
                return book;
            }
        }
        return null;
    }
} 