/**
 * Класс VarArgsDemo демонстрирует перегрузку методов с переменным числом параметров.
 */
public class VarArgsDemo {

    /**
     * Метод печатает целые числа.
     * @param numbers переменное число целых чисел
     */
    public static void print(int... numbers) {
        System.out.println("Метод print(int... numbers):");
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    /**
     * Метод печатает строки.
     * @param strings переменное число строк
     */
    public static void print(String... strings) {
        System.out.println("Метод print(String... strings):");
        for (String s : strings) {
            System.out.println(s);
        }
    }

    /**
     * Основной метод программы.
     * Демонстрирует вызов перегруженных методов с varargs.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        print(1, 2, 3);               
        print("Привет", "Фёдор");     
        print();                      
    }
}
