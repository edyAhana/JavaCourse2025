import java.util.StringJoiner;

/**
 * Демонстрация работы класса StringJoiner.
 */
public class StringJoinerExample {

    public static void main(String[] args) {

        // Пример 1: создание StringJoiner с разделителем ", "
        StringJoiner joiner1 = new StringJoiner(", ");
        joiner1.add("Apple");
        joiner1.add("Banana");
        joiner1.add("Cherry");
        System.out.println("Пример 1: " + joiner1);
        // Вывод: Apple, Banana, Cherry

        // Пример 2: StringJoiner с разделителем и префиксом и суффиксом
        StringJoiner joiner2 = new StringJoiner(" | ", "[", "]");
        joiner2.add("Red");
        joiner2.add("Green");
        joiner2.add("Blue");
        System.out.println("Пример 2: " + joiner2);
        // Вывод: [Red | Green | Blue]

        // Пример 3: объединение двух StringJoiner
        StringJoiner joiner3 = new StringJoiner("; ");
        joiner3.add("Dog");
        joiner3.add("Cat");

        StringJoiner joiner4 = new StringJoiner("; ");
        joiner4.add("Lion");
        joiner4.add("Tiger");

        // Метод merge объединяет два StringJoiner
        joiner3.merge(joiner4);
        System.out.println("Пример 3: " + joiner3);
        // Вывод: Dog; Cat; Lion; Tiger

        // Пример 4: использование toString() для получения строки
        String result = joiner2.toString();
        System.out.println("Пример 4: " + result);
        // Вывод: [Red | Green | Blue]
    }
}
