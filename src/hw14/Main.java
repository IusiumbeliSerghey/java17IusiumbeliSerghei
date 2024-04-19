package hw14;
//Добавить в свои классы проверку и выкидывать исключения в случае ошибок
//Обработать исключения в try catch


public class Main {
    public static int findMax(int[] array) {
        try {
            if (array.length == 0) {
                throw new IllegalArgumentException("Array must not be empty");
            }

            int max = array[0];

            for (int i = 1; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }

            return max;
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            return array.length;
        }
    }


}



