/**
 * Демонстрация того, что final-метод нельзя переопределить в подклассе.
 */
public class FinalMethodExample {

    /**
     * Суперкласс с final-методом.
     */
    static class Parent {

        /**
         * Финальный метод 
         */
        public final void showMessage() {
            System.out.println("Сообщение из Parent");
        }
    }

    /**
     * Подкласс пытается переопределить final-метод.
     * Это вызовет ошибку компиляции.
     */
    static class Child extends Parent {

        /**
         * Попытка переопределить final-метод.
         */
        // @Override
        // public void showMessage() {
        //     System.out.println("Сообщение из Child");
        // }

    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.showMessage();

        Child child = new Child();
        child.showMessage(); 
    }
}
