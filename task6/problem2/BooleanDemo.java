/**
 * Класс BooleanDemo демонстрирует различные способы создания объектов класса Boolean.
 */
public class BooleanDemo {

    /**
     * Основной метод программы.
     * Показывает создание объектов Boolean через valueOf и через конструктор.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);

        Boolean b3 = Boolean.valueOf("true");
        Boolean b4 = Boolean.valueOf("false");
        Boolean b5 = Boolean.valueOf("TrUe");
        Boolean b6 = Boolean.valueOf("hello");

        Boolean b7 = new Boolean(true);
        Boolean b8 = new Boolean("true");
        Boolean b9 = new Boolean("false");

        System.out.println("b1 = " + b1);
        System.out.println("b2 = " + b2);
        System.out.println("b3 = " + b3);
        System.out.println("b4 = " + b4);
        System.out.println("b5 = " + b5);
        System.out.println("b6 = " + b6);
        System.out.println("b7 = " + b7);
        System.out.println("b8 = " + b8);
        System.out.println("b9 = " + b9);
    }
}
