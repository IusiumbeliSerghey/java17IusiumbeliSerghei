package hw15;
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Red", 0);

        try {
            // Test drive with zero fuel consumption
            myCar.drive(8);
        } catch (NotFuelException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }

        try {
            // Test safety belt with "Not Belt" status
            myCar.safetyBelt("Not Belt");
        } catch (NotBeltException e) {
            System.err.println("Exception caught: " + e.getMessage());
        }
    }
}
