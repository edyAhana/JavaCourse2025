/**
 * Демонстрация доступа внешнего класса к полям и методам внутреннего класса.
 * Доступ внешнего класса к внутреннему зависит от спецификатора доступа внутреннего класса.
 */
public class OuterAccessToInner {

    /**
     * Внешний класс с внутренними классами с разными модификаторами доступа.
     */
    public class Outer {

        // Public внутренний класс
        public class PublicInner {
            private int privateField = 10;
            int defaultField = 20;
            protected int protectedField = 30;
            public int publicField = 40;

            private void privateMethod() {
                System.out.println("Private метод PublicInner");
            }

            void defaultMethod() {
                System.out.println("Default метод PublicInner");
            }

            protected void protectedMethod() {
                System.out.println("Protected метод PublicInner");
            }

            public void publicMethod() {
                System.out.println("Public метод PublicInner");
            }
        }

        // Private внутренний класс
        private class PrivateInner {
            public void show() {
                System.out.println("Private внутренний класс");
            }
        }

        /**
         * Внешний метод для демонстрации доступа к внутренним классам
         */
        public void accessInner() {
            // Внешний класс может создавать экземпляры всех внутренних классов, к которым имеет доступ

            // Доступ к public внутреннему классу
            PublicInner pubInner = new PublicInner();
            System.out.println("Доступ к полям PublicInner из внешнего класса:");
            System.out.println("privateField = " + pubInner.privateField);
            System.out.println("defaultField = " + pubInner.defaultField);
            System.out.println("protectedField = " + pubInner.protectedField);
            System.out.println("publicField = " + pubInner.publicField);

            pubInner.privateMethod();
            pubInner.defaultMethod();
            pubInner.protectedMethod();
            pubInner.publicMethod();

            // Доступ к private внутреннему классу возможен напрямую
            PrivateInner privInner = new PrivateInner();
            privInner.show();

            // Если бы внутренний класс был package-private или protected, внешний класс
            // в том же пакете имел бы доступ, но из другого пакета — нет.
        }
    }

    public static void main(String[] args) {
        OuterAccessToInner example = new OuterAccessToInner();
        Outer outer = example.new Outer();
        outer.accessInner();
    }
}
