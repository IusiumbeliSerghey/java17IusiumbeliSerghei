package hw15;

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 50);

        try {
            // Test drive with zero fuel consumption
            myCar.safetyBelt("Not Belt");
            myCar.drive(0);

        } catch (NotFuelException | NotBeltException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
