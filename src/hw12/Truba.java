package hw12;

public class Truba implements Musicalinstrument {
    private final String diameter;

    public Truba(String diameter) {
        this.diameter = diameter;
    }

    public void play() {
        System.out.println("Играет труба с диаметром " + diameter);
    }
}
