package hw12;

public class Baraban implements Musicalinstrument {
    private final String size;

    public Baraban(String size) {
        this.size = size;
    }

    public void play() {
        System.out.println("Играет барабан размером " + size);
    }
}