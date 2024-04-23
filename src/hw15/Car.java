package hw15;

/*
Создайте 2 исключения. Первое будет являтся дочерним классом класса RuntimeException
 и в нем создайте конструктор, который принимает 1 параметр int и передает его в конструктор super класса.
 Первое исключение называется NotFuelException.
 Второе пусть является дочерним классом класса Exception и называется NotBeltException.
  Также пусть передает параметр String в конструктор super класс.а.

Создать класс Car. Создать аттрибуты name, color и fuelLevel.
 Первый метод drive будет иметь тип данных void и параметр int.
  Если данный  параметр равен нулю, то пусть выбрасывается исключение NotFuelException.
   Второй метод safetyBelt пусть принимает String и если в строке будет значение "Not Belt",
    то пусть выбрасывается NotBeltException. Если нет, то пусть выводит сообщение "Car is running"
 */
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
