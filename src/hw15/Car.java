package hw15;
class Car {
    private String name;
    private String color;
    private int fuelLevel;

    public Car(String name, String color, int fuelLevel) {
        this.name = name;
        this.color = color;
        this.fuelLevel = fuelLevel;
    }

    public void drive(int fuelConsumption) {
        if (fuelConsumption == 0) {
            throw new NotFuelException(fuelConsumption);
        } else {
            fuelLevel -= fuelConsumption;

        }
    }

    public void safetyBelt(String status) throws NotBeltException {
        if (status.equals("Not Belt")) {
            throw new NotBeltException("Safety belt is not fastened");
        } else {
            System.out.println("Car is running");
        }
    }
}
