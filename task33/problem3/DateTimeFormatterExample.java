import java.util.Calendar;
import java.util.Formatter;

/**
 * Демонстрация форматирования времени и даты с помощью спецификаторов %t.
 */
public class DateTimeFormatterExample {

    public static void main(String[] args) {

        // Получаем текущую дату и время
        Calendar calendar = Calendar.getInstance();

        Formatter formatter = new Formatter(System.out);

        // 1. %tH — час (00–23)
        formatter.format("Час (24-часовой): %tH%n", calendar);

        // 2. %tI — час (1–12)
        formatter.format("Час (12-часовой): %tI%n", calendar);

        // 3. %tM — минуты (00–59)
        formatter.format("Минуты: %tM%n", calendar);

        // 4. %tS — секунды (00–59)
        formatter.format("Секунды: %tS%n", calendar);

        // 5. %tY — год в четырехзначном формате
        formatter.format("Год: %tY%n", calendar);

        // Дополнительно: %tB — полное название месяца
        formatter.format("Месяц: %tB%n", calendar);

        // Закрытие Formatter
        formatter.close();
    }
}
