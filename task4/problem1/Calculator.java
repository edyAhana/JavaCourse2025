/**
 * Класс Calculator демонстрирует простые арифметические операции.
 * @author Фёдор
 * @version 1.0
 */
public class Calculator {

    /**
     * Складывает два целых числа.
     * @param a первое число
     * @param b второе число
     * @return сумма a и b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Вычитает одно число из другого.
     * @param a уменьшаемое
     * @param b вычитаемое
     * @return результат a - b
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Основной метод для демонстрации работы класса.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.add(5, 3));
        System.out.println(calc.subtract(10, 4));
    }
}
