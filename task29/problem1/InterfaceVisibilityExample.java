/**
 * Демонстрация области видимости интерфейса без явного спецификатора доступа.
 */
public class InterfaceVisibilityExample {

    /**
     * Интерфейс без явного модификатора доступа.
     * По умолчанию имеет package-private (доступ в пределах пакета) область видимости.
     */
    interface MyInterface {
        void doSomething(); // автоматически public abstract
    }

    /**
     * Класс в том же пакете может реализовать интерфейс.
     */
    static class MyClass implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Реализация интерфейса внутри пакета");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.doSomething();
    }
}
