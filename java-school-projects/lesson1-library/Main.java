import java.util.Scanner;
package booklib;

public class Main {
    public static void main() {
        Library lib = Library.getInstance();
        Scanner scan = new Scanner(System.in);
        while (1) {
            String command = scan.next().toLowerCase()
            switch (command) {
                case "quit":
                    System.out.println("Quiting...");
                    break;

                case "add":
                    System.out.println("creating a book.");
                    System.out.print("enter the title: ");
                    String title = scan.next();
                    System.out.print(\n"enter the author: ");
                    String author = scan.next();
                    System.out.print(\n"enter the year: ");
                    int year = scan.next();
                    lib.addBook(title, author, year);

                case "display":
                    lib.displayBooks();
                
                case "search":
                    System.out.print("\nenter the book that you want to search for: ");
                    Book book = lib.searchByTitle(scan.next());
                    try {
                        book.getDetails();
                    } catch {
                        System.out.print("\nno book found. (check your spelling?)");
                        continue;
                    }
                default:
                    System.out.println("Unknown command.");

            }


        }
        scan.close()

    }

}