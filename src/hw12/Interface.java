package hw12;
//Интерфейс Printable
//Определить интерфейс Printable, содержащий метод void print().
//Определить класс Book, реализующий интерфейс Printable.
//Определить класс Magazine, реализующий интерфейс Printable.
//Создать массив типа Printable, который будет содержать книги и журналы.
//В цикле пройти по массиву и вызвать метод print() для каждого объекта.
//Создать статический метод printMagazines(Printable[] printable) в классе
// Magazine, который выводит на консоль названия только журналов.
//Создать статический метод printBooks(Printable[] printable) в классе Book,
// который выводит на консоль названия только книг. Используем оператор instanceof.
//Интерфейс Инструмент
//Создать интерфейс Инструмент и реализующие его классы Гитара, Барабан и Труба.
//Интерфейс Инструмент содержит метод play() и переменную String KEY ="До мажор".
//Гитара содержит переменные класса количествоСтрун, Барабан - размер, Труба - диаметр.
//Создать массив типа Инструмент, содержащий инструменты разного типа.
//В цикле вызвать метод play() для каждого инструмента, который должен выводить строку
// "Играет такой-то инструмент, с такими-то характеристиками".

interface Printable {
    void print();
}


interface Musicalinstrument {
    String KEY = "До мажор";

    void play();
}

public class Interface {
    public static void main(String[] args) {
        Printable[] printableItems = new Printable[4];
        printableItems[0] = new Book("Java: Полное руководство");
        printableItems[1] = new Magazine("National Geographic");
        printableItems[2] = new Book("Война и мир");
        printableItems[3] = new Magazine("Time");

        for (Printable printable : printableItems) {
            printable.print();
        }

        Musicalinstrument[] instruments = new Musicalinstrument[3];
        instruments[0] = new Gitara(6);
        instruments[1] = new Baraban("большой");
        instruments[2] = new Truba("средний");

        for (Musicalinstrument instrument : instruments) {
            instrument.play();
        }
    }
}

