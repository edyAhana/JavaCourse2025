import java.util.Formatter;
import java.util.Locale;

/**
 * Демонстрация использования класса Formatter с различными спецификаторами.
 */
public class FormatterExample {

    public static void main(String[] args) {

        int intValue = 42;
        double doubleValue = 3.14159;
        boolean boolValue = true;
        char charValue = 'A';
        String strValue = "Java";

        // Создание Formatter для форматированного вывода в консоль
        Formatter formatter = new Formatter(System.out, Locale.US);

        // 1. %d - десятичное целое число
        formatter.format("1. Десятичное число: %d%n", intValue);

        // 2. %f - число с плавающей точкой
        formatter.format("2. Число с плавающей точкой: %.2f%n", doubleValue);

        // 3. %b - логическое значение
        formatter.format("3. Логическое значение: %b%n", boolValue);

        // 4. %c - символ
        formatter.format("4. Символ: %c%n", charValue);

        // 5. %s - строковое представление
        formatter.format("5. Строка: %s%n", strValue);

        // Дополнительно: %% - вставка знака %
        formatter.format("Процентное значение: 50%% выполнено%n");

        // Закрытие Formatter
        formatter.close();
    }
}
