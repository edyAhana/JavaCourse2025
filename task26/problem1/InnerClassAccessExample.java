/**
 * Демонстрация использования различных спецификаторов доступа для внутренних классов.
 */
public class InnerClassAccessExample {

    /**
     * Внешний класс с внутренними классами.
     */
    public class Outer {

        /**
         * Публичный внутренний класс.
         * Доступен из любого другого класса.
         */
        public class PublicInner {
            public void show() {
                System.out.println("Это public внутренний класс");
            }
        }

        /**
         * Защищённый внутренний класс.
         * Доступен в пределах пакета и для подклассов.
         */
        protected class ProtectedInner {
            public void show() {
                System.out.println("Это protected внутренний класс");
            }
        }

        /**
         * Внутренний класс с доступом по умолчанию (package-private).
         * Доступен только в пределах пакета.
         */
        class DefaultInner {
            public void show() {
                System.out.println("Это default внутренний класс");
            }
        }

        /**
         * Приватный внутренний класс.
         * Доступен только внутри внешнего класса Outer.
         */
        private class PrivateInner {
            public void show() {
                System.out.println("Это private внутренний класс");
            }
        }

        /**
         * Методы для демонстрации доступа к private внутреннему классу.
         */
        public void accessPrivateInner() {
            PrivateInner pi = new PrivateInner();
            pi.show();
        }
    }

    public static void main(String[] args) {
        InnerClassAccessExample example = new InnerClassAccessExample();
        Outer outer = example.new Outer();

        // Доступ к public внутреннему классу
        Outer.PublicInner pubInner = outer.new PublicInner();
        pubInner.show();

        // Доступ к protected внутреннему классу
        Outer.ProtectedInner protInner = outer.new ProtectedInner();
        protInner.show();

        // Доступ к default внутреннему классу (в пределах пакета)
        Outer.DefaultInner defInner = outer.new DefaultInner();
        defInner.show();

        // Приватный внутренний класс недоступен напрямую из main

        // Доступ через метод внешнего класса
        outer.accessPrivateInner();
    }
}
