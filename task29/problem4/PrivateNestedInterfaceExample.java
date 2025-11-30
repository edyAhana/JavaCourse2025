/**
 * Демонстрация интерфейса с модификатором private внутри внешнего класса.
 */
public class PrivateNestedInterfaceExample {

    /**
     * Вложенный интерфейс с модификатором private.
     * Доступен только внутри внешнего класса.
     */
    private interface MyInterface {
        void doSomething();
    }

    /**
     * Внутри внешнего класса можно реализовать private интерфейс.
     */
    private static class MyClass implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Реализация private вложенного интерфейса");
        }
    }

    public static void main(String[] args) {
        // Доступ к MyClass возможен, так как он вложенный и private
        MyClass obj = new MyClass();
        obj.doSomething();

    }
}
