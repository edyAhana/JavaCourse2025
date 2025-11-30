/**
 * Демонстрация того, как аннотация {@code @Override} помогает обнаруживать ошибки
 * при переопределении методов.
 */
public class OverrideAnnotationExample {

    /**
     * Суперкласс с методом, который будет корректно переопределён.
     */
    static class Parent {

        /**
         * Метод суперкласса для демонстрации переопределения.
         */
        public void showMessage() {
            System.out.println("Сообщение из Parent");
        }
    }

    /**
     * Подкласс, в котором намеренно совершена ошибка
     */
    static class Child extends Parent {

        /**
         * Попытка переопределения метода.
         * Однако из-за опечатки метод
         * не совпадает с методом суперкласса и фактически не переопределяет его.
         */
        @Override
        public void showMassage() { 
            System.out.println("Сообщение из Child");
        }
    }

    public static void main(String[] args) {
        // Код не запустится, потому что класс Child не скомпилируется.
    }
}
