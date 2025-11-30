/**
 * Класс демонстрирует, как используются ключевые слова {@code this} и {@code super}
 * в контексте наследования.
 *
 * Ключевое слово {@code this} используется для:
 *     обращения к полям текущего объекта, если их «затеняет» параметр или локальная переменная;
 *     вызова конструктора текущего класса ({@code this(...)}) для переиспользования логики и сокращения кода;
 *     передачи текущего объекта как аргумента в методы.
 *
 * Ключевое слово {@code super} используется для:
 *     обращения к полям и методам суперкласса, если они переопределены в подклассе;
 *     вызова конструктора суперкласса ({@code super(...)}) — и этот вызов всегда должен быть первой строкой конструктора подкласса.
 */
public class ThisAndSuperExplanation {

    /**
     * Пример суперкласса с полем и методом.
     */
    static class Parent {
        String message = "Сообщение из родителя";

        /**
         * Метод суперкласса.
         */
        void showMessage() {
            System.out.println("Метод Parent: " + message);
        }
    }

    /**
     * Подкласс, который показывает использование this и super.
     */
    static class Child extends Parent {

        String message = "Сообщение из ребёнка";

        /**
         * Конструктор, демонстрирующий вызов конструктора суперкласса 
         * Здесь super() вызывается неявн
         */
        Child() {
        }

        /**
         * Метод, демонстрирующий разницу между this и super.
         */
        void demonstrate() {
            System.out.println("this.message → " + this.message);
            System.out.println("super.message → " + super.message);

            this.showMessage();   
            super.showMessage();  
        }
    }

    /**
     * Точка входа для демонстрации работы.
     */
    public static void main(String[] args) {
        Child child = new Child();
        child.demonstrate();
    }
}
