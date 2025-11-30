/**
 * Демонстрация доступа внутреннего класса к полям и методам внешнего класса.
 * Показано, что внутренний класс всегда может обращаться к членам внешнего класса,
 * даже если они объявлены как private.
 */
public class InnerClassAccessToOuter {

    /**
     * Внешний класс с полями разных спецификаторов доступа.
     */
    public class Outer {
        private int privateField = 10;
        int defaultField = 20;        
        protected int protectedField = 30;
        public int publicField = 40;

        private void privateMethod() {
            System.out.println("Private метод внешнего класса");
        }

        void defaultMethod() {
            System.out.println("Default метод внешнего класса");
        }

        protected void protectedMethod() {
            System.out.println("Protected метод внешнего класса");
        }

        public void publicMethod() {
            System.out.println("Public метод внешнего класса");
        }

        /**
         * Внутренний класс.
         * Показывает, что внутренний класс может обращаться ко всем членам внешнего класса.
         */
        public class Inner {
            public void accessOuterMembers() {
                // Доступ к полям внешнего класса
                System.out.println("privateField = " + privateField);
                System.out.println("defaultField = " + defaultField);
                System.out.println("protectedField = " + protectedField);
                System.out.println("publicField = " + publicField);

                privateMethod();
                defaultMethod();
                protectedMethod();
                publicMethod();
            }
        }
    }

    public static void main(String[] args) {
        InnerClassAccessToOuter example = new InnerClassAccessToOuter();
        Outer outer = example.new Outer();
        Outer.Inner inner = outer.new Inner();

        inner.accessOuterMembers();
    }
}
// Пояснение задачи:

// Внутренний класс всегда имеет доступ к полям и методам внешнего класса, даже если они объявлены как private.

// Спецификаторы доступа (private, default, protected, public) не ограничивают доступ внутреннего класса к членам внешнего класса.

// Внутренний класс хранит скрытую ссылку на объект внешнего класса (enclosing object), через которую он может обращаться ко всем его членам.

// Это делает внутренние классы удобными для реализации логики, тесно связанной с объектом внешнего класса, без нарушения инкапсуляции.