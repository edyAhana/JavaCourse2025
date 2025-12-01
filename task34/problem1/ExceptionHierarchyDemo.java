/**
 * Демонстрация иерархии исключений и их назначения.
 */
public class ExceptionHierarchyDemo {

    /**
     * Главный метод программы, демонстрирующий работу различных типов исключений.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Пример RuntimeException (непроверяемое)
        try {
            int x = 10 / 0; // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Поймано непроверяемое исключение: " + e);
        }

        // Пример Exception (проверяемое)
        try {
            throwCheckedException();
        } catch (Exception e) {
            System.out.println("Поймано проверяемое исключение: " + e);
        }

        // Пример Error (ловить обычно не рекомендуется, но технически возможно)
        try {
            throwError();
        } catch (Error e) {
            System.out.println("Пойман критический Error: " + e);
        }
    }

    /**
     * Метод, который выбрасывает проверяемое исключение.
     *
     * @throws Exception обычное проверяемое исключение
     */
    public static void throwCheckedException() throws Exception {
        throw new Exception("Это проверяемое исключение");
    }

    /**
     * Метод, который выбрасывает критическую ошибку.
     *
     * @throws Error ошибка уровня JVM
     */
    public static void throwError() throws Error {
        throw new Error("Это критическая ошибка JVM");
    }
}
