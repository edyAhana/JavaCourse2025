/**
 * Демонстрация интерфейса с модификатором доступа public.
 */
public class PublicInterfaceExample {

    /**
     * Интерфейс с модификатором public.
     * Доступен из любого пакета.
     */
    public interface MyInterface {
        void doSomething(); // автоматически public abstract
    }

    /**
     * Класс, реализующий интерфейс.
     * Может находиться в любом пакете при условии импорта интерфейса.
     */
    static class MyClass implements MyInterface {
        @Override
        public void doSomething() {
            System.out.println("Реализация public интерфейса");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.doSomething();
    }
}
