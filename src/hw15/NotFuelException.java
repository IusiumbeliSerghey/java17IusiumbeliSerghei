package hw15;
class NotFuelException extends RuntimeException {
    public NotFuelException(int fuel) {
        super("Not enough fuel: " + fuel);
    }
}
