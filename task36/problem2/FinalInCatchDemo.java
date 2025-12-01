/**
 * Демонстрация использования final в catch-блоке и вложенных try-catch конструкций.
 */
public class FinalInCatchDemo {

    /**
     * Главный метод показывает работу catch(final ...) и вложенных try-блоков.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        demonstrateFinalCatch();
        demonstrateNestedTry();
    }

    /**
     * Метод демонстрирует использование ключевого слова final в catch-блоке.
     */
    public static void demonstrateFinalCatch() {
        try {
            Integer.parseInt("abc"); // NumberFormatException
        } catch (final Exception e) {
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName());

            // Попытка изменить e вызвала бы ошибку:
            // e = new Exception("Нельзя так делать!"); // ❌ final запрещает
        }
    }

    /**
     * Метод демонстрирует вложенные try-catch блоки.
     */
    public static void demonstrateNestedTry() {
        try {
            System.out.println("Внешний try начат.");

            try {
                String s = null;
                s.length(); // NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Внутренний catch: пойман NullPointerException");
            }

            int x = 10 / 0; // ArithmeticException (будет пойман внешним catch)

        } catch (ArithmeticException e) {
            System.out.println("Внешний catch: пойман ArithmeticException");
        }
    }
}
