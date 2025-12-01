/**
 * Демонстрация того, что try-блок не может существовать без catch или finally.
 */
public class InvalidTryExample {

    /**
     * Главный метод. Код внутри try без catch/finally НЕ компилируется.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Этот код вызовет ошибку компиляции:
        /*
        try {
            System.out.println("Это невалидная конструкция.");
        }
        */

        // Правильный вариант №1 — try + catch
        try {
            int x = Integer.parseInt("123");
        } catch (NumberFormatException e) {
            System.out.println("Перехвачено исключение: " + e.getMessage());
        }

        // Правильный вариант №2 — try + finally
        try {
            System.out.println("Работаем...");
        } finally {
            System.out.println("Это выполнится всегда.");
        }
    }
}
