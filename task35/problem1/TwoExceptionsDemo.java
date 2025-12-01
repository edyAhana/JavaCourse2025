/**
 * Демонстрация двух исключений:
 * 1) ArithmeticException — перехватывается.
 * 2) NullPointerException — не перехватывается и вызывает аварийное завершение программы.
 */
public class TwoExceptionsDemo {

    /**
     * Главный метод запускает примеры и показывает поведение необработанного исключения.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Это исключение будет перехвачено
        catchArithmeticException();

        // Это исключение НЕ будет перехвачено — программа аварийно завершится
        generateUnhandledException();

        // Этот вывод не выполнится, т.к. программа завершится выше
        System.out.println("Этот текст никогда не будет напечатан.");
    }

    /**
     * Метод демонстрирует перехват ArithmeticException.
     */
    public static void catchArithmeticException() {
        try {
            int result = 10 / 0; // Генерация ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e);
        }
    }

    /**
     * Метод демонстрирует необработанное исключение.
     * Здесь возникает NullPointerException, но блока try-catch нет.
     */
    public static void generateUnhandledException() {
        String text = null;
        text.length(); // Генерация NullPointerException 
    }
}
