/**
 * Демонстрация конфликта default методов при реализации двух интерфейсов.
 */
public class MultipleInterfaceConflict {

    /**
     * Первый интерфейс с default методом.
     */
    interface InterfaceA {
        default void show() {
            System.out.println("Метод InterfaceA");
        }
    }

    /**
     * Второй интерфейс с default методом с таким же именем.
     */
    interface InterfaceB {
        default void show() {
            System.out.println("Метод InterfaceB");
        }
    }

    /**
     * Класс реализует оба интерфейса.
     * При наличии одинаковых default методов возникает конфликт.
     */
    static class MyClass implements InterfaceA, InterfaceB {

        /**
         * Для разрешения конфликта необходимо переопределить метод show()
         * и явно выбрать, какой из default методов вызывать.
         */
        @Override
        public void show() {
            System.out.println("Переопределенный метод в MyClass");
            
            // Вызов конкретного метода интерфейса
            InterfaceA.super.show(); // вызывает InterfaceA.show()
            InterfaceB.super.show(); // вызывает InterfaceB.show()
        }
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.show();
    }
}
