/**
 * Класс содержит примеры генерации и обработки
 * распространённых исключений в Java.
 */
public class ExceptionExamples {

    /**
     * Главный метод запуска примеров.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        handleArithmeticException();
        handleArrayIndexOutOfBoundsException();
        handleIllegalArgumentException();
        handleClassCastException();
        handleNullPointerException();
    }

    /**
     * Пример генерации и обработки ArithmeticException.
     * Возникает при делении на ноль.
     */
    public static void handleArithmeticException() {
        try {
            int a = 10;
            int b = 0;
            int result = a / b; // Генерация ArithmeticException
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException обработано: деление на ноль невозможно.");
        }
    }

    /**
     * Пример генерации и обработки ArrayIndexOutOfBoundsException.
     * Возникает при обращении к индексу массива вне допустимого диапазона.
     */
    public static void handleArrayIndexOutOfBoundsException() {
        try {
            int[] arr = {1, 2, 3};
            int value = arr[5]; // Генерация ArrayIndexOutOfBoundsException
            System.out.println(value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException обработано: индекс вне диапазона массива.");
        }
    }

    /**
     * Пример генерации и обработки IllegalArgumentException.
     * Возникает, когда методу передан некорректный аргумент.
     */
    public static void handleIllegalArgumentException() {
        try {
            setAge(-5); // Генерация IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException обработано: " + e.getMessage());
        }
    }

    /**
     * Метод для демонстрации IllegalArgumentException.
     *
     * @param age возраст, который должен быть >= 0
     * @throws IllegalArgumentException если возраст отрицательный
     */
    public static void setAge(int age) throws IllegalArgumentException {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        System.out.println("Возраст установлен: " + age);
    }

    /**
     * Пример генерации и обработки ClassCastException.
     * Возникает при попытке некорректного приведения типов.
     */
    public static void handleClassCastException() {
        try {
            Object obj = Integer.valueOf(10);
            String text = (String) obj; // Генерация ClassCastException
            System.out.println(text);
        } catch (ClassCastException e) {
            System.out.println("ClassCastException обработано: некорректное приведение типов.");
        }
    }

    /**
     * Пример генерации и обработки NullPointerException.
     * Возникает при обращении к методу/полю нулевой ссылки.
     */
    public static void handleNullPointerException() {
        try {
            String str = null;
            int length = str.length(); // Генерация NullPointerException
            System.out.println(length);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException обработано: попытка обратиться к null.");
        }
    }
}
