/**
 * Демонстрация обработки нескольких исключений:
 * 1) Несколько разных исключений обрабатываются одинаково.
 * 2) Исключения находятся в одной иерархии: Ex3 -> Ex2 -> Ex1.
 */
public class MultipleCatchDemo {

    /**
     * Главный метод запускает демонстрацию различных вариантов обработки исключений.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        processIdenticalCatchExample();
        System.out.println("---------------------------------");
        processHierarchyCatchExample();
    }

    /**
     * Пример №1:
     * Несколько исключений обрабатываются абсолютно одинаково.
     *
     * Здесь обрабатываются:
     * - ArithmeticException
     * - ArrayIndexOutOfBoundsException
     */
    public static void processIdenticalCatchExample() {
        try {
            int a = 10 / 0;        // ArithmeticException
            int[] arr = new int[2];
            int x = arr[10];       // ArrayIndexOutOfBoundsException (не будет выполнено)
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Одинаковая обработка разных исключений: " + e.getClass().getSimpleName());
        }
    }

    /**
     * Пример №2:
     * Исключения образуют иерархию:
     * Ex3 -> Ex2 -> Ex1.
     *
     * Обработка должна идти от самого «узкого» к самому «широкому».
     */
    public static void processHierarchyCatchExample() {
        try {
            throw new Ex3("Исключение самого нижнего уровня");
        } catch (Ex3 e) {
            System.out.println("Перехвачено Ex3: " + e.getMessage());
        } catch (Ex2 e) {
            System.out.println("Перехвачено Ex2: " + e.getMessage());
        } catch (Ex1 e) {
            System.out.println("Перехвачено Ex1: " + e.getMessage());
        }
    }
}

/**
 * Базовое исключение иерархии.
 */
class Ex1 extends Exception {
    /**
     * Конструктор для исключения Ex1.
     *
     * @param message текст ошибки
     */
    public Ex1(String message) {
        super(message);
    }
}

/**
 * Подкласс исключения Ex1.
 */
class Ex2 extends Ex1 {
    /**
     * Конструктор для исключения Ex2.
     *
     * @param message текст ошибки
     */
    public Ex2(String message) {
        super(message);
    }
}

/**
 * Подкласс исключения Ex2.
 */
class Ex3 extends Ex2 {
    /**
     * Конструктор для исключения Ex3.
     *
     * @param message текст ошибки
     */
    public Ex3(String message) {
        super(message);
    }
}
