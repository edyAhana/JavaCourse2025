/**
 * Класс BoxingUnboxingDemo демонстрирует автоупаковку (boxing) и автораспаковку (unboxing)
 * и показывает случай, когда при unboxing возникает NullPointerException.
 */
public class BoxingUnboxingDemo {

    /**
     * Основной метод программы.
     * Демонстрирует, как NullPointerException может возникнуть при попытке
     * автораспаковки null-объекта-оболочки.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Автоупаковка (boxing) — безопасна
        Integer boxedInt = 12;

        // Автораспаковка (unboxing) — безопасна
        int unboxedInt = boxedInt;

        // Пример NullPointerException при unboxing
        Integer nullInteger = null;
        try {
            int value = nullInteger; // здесь произойдет NullPointerException
        } catch (NullPointerException e) {
            System.out.println("NullPointerException при unboxing: " + e);
        }

        // Безопасная автоупаковка null не вызывает исключений
        Integer anotherBoxed = null;
        System.out.println("anotherBoxed = " + anotherBoxed);
    }
}
