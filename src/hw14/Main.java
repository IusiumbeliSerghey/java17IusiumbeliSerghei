package hw14;


public class Main {
    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty");
        }

        int max = array[0]; // Инициализация первым элементом

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }


}
