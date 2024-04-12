package hw12;

interface Printable{
    void print();
}


class Book implements Printable {
    private static String title;

    public Book(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Book: " + title);
    }

}


class Magazine implements Printable {
    private String title;

    public Magazine(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Magazine: " + title);
    }
}


// Класс Гитара реализует интерфейс Инструмент
class Gitara implements  Musicalinstrument{
    private int numberOfStrings;

    public Gitara(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}

// Класс Барабан реализует интерфейс Инструмент
class Baraban implements Musicalinstrument {
    private String size;

    public Baraban(String size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан размером " + size);
    }
}

// Класс Труба реализует интерфейс Инструмент
class Truba implements Musicalinstrument {
    private String diameter;

    public Truba(String diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}

// Интерфейс Инструмент
interface Musicalinstrument {
    String KEY = "До мажор";

    void play();
}

public class Interface {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Java: Полное руководство");
        printableItems[1] = new Magazine("National Geographic");
        printableItems[2] = new Book("Война и мир");
        printableItems[3] = new Magazine("Time");

        for (Printable printable : printableItems) {
            printable.print();
        }

        Musicalinstrument[] instruments = new Musicalinstrument[3];
        instruments[0] = new Gitara(6);
        instruments[1] = new Baraban("большой");
        instruments[2] = new Truba("средний");

        for (Musicalinstrument instrument : instruments) {
            instrument.play();
        }
    }
}

