package hw12;

public class Book implements Printable {
    private final String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book: " + title);
    }

}