package hw12;

public class Gitara implements  Musicalinstrument{
    private final int numberOfStrings;

    public Gitara(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public void play() {
        System.out.println("Играет гитара с " + numberOfStrings + " струнами");
    }
}

