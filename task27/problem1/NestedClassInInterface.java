/**
 * Демонстрация вложенного класса внутри интерфейса.
 * Вложенный класс в интерфейсе по умолчанию статический.
 */
public class NestedClassInInterface {

    /**
     * Интерфейс с вложенным классом.
     */
    interface MyInterface {

        /**
         * Вложенный класс. Он автоматически является статическим.
         */
        class Nested {
            private String message;

            public Nested(String message) {
                this.message = message;
            }

            public void showMessage() {
                System.out.println("Сообщение из Nested: " + message);
            }
        }

        // В интерфейсе можно также объявлять методы
        void doSomething();
    }

    public static void main(String[] args) {
        // Создание объекта вложенного класса интерфейса
        MyInterface.Nested nestedObj = new MyInterface.Nested("Привет, мир!");
        nestedObj.showMessage();  // Вызов метода вложенного класса
    }
}
