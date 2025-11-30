/**
 * Пример перегруженных методов.
 */
public class OverloadingExample {

    /**
     * Метод с двумя параметрами — первая версия.
     */
    public void print(String message) {
        System.out.println("String: " + message);
    }

    /**
     * Перегруженный метод — отличается типом параметра.
     */
    public void print(int number) {
        System.out.println("Integer: " + number);
    }

    /**
     * Перегруженный метод — отличается количеством параметров.
     */
    public void print(String message, int number) {
        System.out.println("String + number: " + message + " " + number);
    }

    public static void main(String[] args) {
        OverloadingExample example = new OverloadingExample();
        example.print("Hello");
        example.print(100);
        example.print("Age:", 25);
    }
}
