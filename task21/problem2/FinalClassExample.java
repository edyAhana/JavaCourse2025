/**
 * Демонстрация того, что final-класс нельзя наследовать.
 */
public class FinalClassExample {

    /**
     * Final-класс, запрещённый для расширения.
     */
    public final static class FinalClass {
        public void show() {
            System.out.println("Method inside final class");
        }
    }

    /**
     * Попытка наследоваться от final-класса.
     *
     */
    /*
    static class Child extends FinalClass {
    }
    */

    public static void main(String[] args) {
        FinalClass fc = new FinalClass();
        fc.show();
    }
}
