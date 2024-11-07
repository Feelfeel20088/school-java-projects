package booklib;

public class Book {
    String title;
    String author;
    int year;

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return title
    }

    public String getAuthor() {
        return author
    }

    public String getYear() {
        return year
    }
    // overrides could be used here
    public String getDetails() {
        return String.format("Title: %s\nAuthor: %s\nYear: %2d", title, author, year);
    }
    
    public int titleLength() {
        return length(title);
    }
}

