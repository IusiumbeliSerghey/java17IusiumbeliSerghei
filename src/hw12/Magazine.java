package hw12;

public class Magazine implements Printable {
    private final String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Magazine: " + title);
    }
}

