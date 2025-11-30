/**
 * Демонстрация интерфейса с модификатором protected внутри внешнего класса.
 */
public class ProtectedNestedInterfaceExample {

    /**
     * Вложенный интерфейс с модификатором protected.
     * Такой интерфейс доступен внутри пакета и для подклассов внешнего класса.
     */
    protected interface MyInterface {
        void doSomething();
    }

    /**
     * Класс внутри того же пакета может реализовать protected вложенный интерфейс.
     */
    static class MyClass implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Реализация protected вложенного интерфейса");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.doSomething();
    }
}
