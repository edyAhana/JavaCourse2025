/**
 * Класс SwitchDemo демонстрирует использование конструкции switch
 * с различными типами данных: примитивные целочисленные типы, String и enum.
 */
public class SwitchDemo {

    /**
     * Основной метод программы.
     * Показывает примеры switch для int, byte, short, char, String и enum.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Примитивный int
        int valueInt = 2;
        switch (valueInt) {
            case 1: System.out.println("int: 1"); break;
            case 2: System.out.println("int: 2"); break;
            default: System.out.println("int: default"); break;
        }

        // Примитивный byte
        byte valueByte = 1;
        switch (valueByte) {
            case 0: System.out.println("byte: 0"); break;
            case 1: System.out.println("byte: 1"); break;
        }

        // Примитивный short
        short valueShort = 2;
        switch (valueShort) {
            case 1: System.out.println("short: 1"); break;
            case 2: System.out.println("short: 2"); break;
        }

        // Примитивный char
        char valueChar = 'A';
        switch (valueChar) {
            case 'A': System.out.println("char: A"); break;
            case 'B': System.out.println("char: B"); break;
        }

        // String
        String valueStr = "Hello";
        switch (valueStr) {
            case "Hello": System.out.println("String: Hello"); break;
            case "Bye": System.out.println("String: Bye"); break;
            default: System.out.println("String: default"); break;
        }

        // Enum
        Day valueEnum = Day.TUE;
        switch (valueEnum) {
            case MON: System.out.println("Enum: Monday"); break;
            case TUE: System.out.println("Enum: Tuesday"); break;
            default: System.out.println("Enum: Other day"); break;
        }
    }

    /**
     * Enum Day для демонстрации switch с перечислениями.
     */
    enum Day { MON, TUE, WED }
}
