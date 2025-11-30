/**
 * В данном файле объясняется, как работают спецификаторы доступа
 * (private, default, protected, public) при наследовании в Java.
 *
 * Краткое правило:
 *     private — доступно только внутри самого класса; не наследуется как доступный член.
 *     default (пакетный доступ) — доступно в пределах одного пакета; при наследовании из другого пакета недоступно.
 *     protected — доступно в пределах пакета и в подклассах (даже из других пакетов).
 *     public — доступно везде.
 */
public class AccessModifiersExplanation {

    /**
     * Класс A содержит члены с разными модификаторами доступа.
     */
    static class A {

        int a1;               
        public int a2;        
        protected int a3;     
        private int a4;       

        void method1() {
        }

        public void method2() {
        }

        protected void method3() {
        }

        private void method4() {
        }
    }

    /**
     * Класс B расширяет класс A.
     */
    static class B extends A {

        /**
         * Метод демонстрирует доступность членов класса A в классе B.
         */
        void checkAccessInB() {
            // a1 — доступен, т.к. default и класс в том же пакете
            int x1 = a1;

            // a2 — public, доступен всегда
            int x2 = a2;

            // a3 — protected, доступен в наследнике
            int x3 = a3;

            // a4 — private — ❌ недоступен
            // int x4 = a4; → Ошибка компиляции

            method1();  // default → доступно
            method2();  // public → доступно
            method3();  // protected → доступно

            // method4(); → private → ❌ недоступно
        }
    }

    /**
     * Класс C расширяет класс B.
     */
    static class C extends B {

        /**
         * Метод демонстрирует, какие члены класса A доступны в классе C.
         */
        void checkAccessInC() {

            // a1 — default → доступен только если классы в одном пакете.
            int y1 = a1;  

            // a2 — public → доступно
            int y2 = a2;

            // a3 — protected → доступно
            int y3 = a3;

            // a4 — private → недоступно
            // int y4 = a4; → Ошибка

            method1(); // default → доступно, если в одном пакете
            method2(); // public → доступно
            method3(); // protected → доступно

            // method4(); → private → ❌ недоступно
        }
 
