/**
 * Демонстрация использования текстовых блоков (Text Blocks) в Java.
 */
public class TextBlockExample {

    public static void main(String[] args) {

        // Текстовый блок: многострочная строка без необходимости экранирования
        String textBlock = """
                Это пример
                многострочной строки
                с текстовым блоком.
                Можно использовать "кавычки" внутри без экранирования.
                """;

        System.out.println(textBlock);

        // Использование в HTML или JSON
        String html = """
                <html>
                    <body>
                        <h1>Привет, мир!</h1>
                    </body>
                </html>
                """;
        System.out.println(html);
    }
}
