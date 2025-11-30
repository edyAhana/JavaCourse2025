/**
 * Демонстрация трёх вариантов использования ключевого слова {@code super}:
 * 1) вызов конструктора суперкласса;
 * 2) доступ к полю суперкласса;
 * 3) доступ к методу суперкласса.
 */
public class SuperUsageDemo {

    /**
     * Суперкласс.
     */
    static class Parent {

        String message = "Сообщение из Parent";

        /**
         * Конструктор суперкласса.
         */
        Parent(String text) {
            System.out.println("Конструктор Parent: " + text);
        }

        /**
         * Метод суперкласса.
         */
        void showMessage() {
            System.out.println("Метод Parent: " + message);
        }
    }

    /**
     * Подкласс, демонстрирующий использование super.
     */
    static class Child extends Parent {

        String message = "Сообщение из Child";

        /**
         * Конструктор подкласса.
         * Здесь super(...) вызывает конструктор суперкласса.
         */
        Child() {
            super("Вызван из конструктора Child"); 
        }

        /**
         * Метод, демонстрирующий доступ к полю и методу суперкласса.
         */
        void demonstrate() {

            System.out.println("this.message → " + this.message);
            System.out.println("super.message → " + super.message); 

            super.showMessage(); 
        }
    }

    public static void main(String[] args) {
        Child child = new Child();
        child.demonstrate();
    }
}
