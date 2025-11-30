/**
 * Демонстрация интерфейса с default (неабстрактным) методом и статическим методом.
 */
public class InterfaceDefaultStaticExample {

    /**
     * Интерфейс с default и static методами.
     */
    interface MyInterface {
        // Default метод (неабстрактный)
        default void defaultMethod() {
            System.out.println("Вызов default метода интерфейса");
        }

        // Статический метод
        static void staticMethod() {
            System.out.println("Вызов статического метода интерфейса");
        }

        // Абстрактный метод
        void abstractMethod();
    }

    /**
     * Класс, реализующий интерфейс MyInterface.
     */
    static class MyClass implements MyInterface {

        // Реализация абстрактного метода
        @Override
        public void abstractMethod() {
            System.out.println("Реализация абстрактного метода в классе");
        }

        // При желании можно переопределить default метод
        @Override
        public void defaultMethod() {
            System.out.println("Переопределенный default метод в классе");
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Вызов реализованного абстрактного метода
        obj.abstractMethod();

        // Вызов переопределенного default метода через объект
        obj.defaultMethod();

        // Вызов статического метода интерфейса через имя интерфейса
        MyInterface.staticMethod();
    }
}
