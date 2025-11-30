/**
 * Демонстрация использования встроенных аннотаций Java.
 */
public class AnnotationsExample {

    /**
     * Пример аннотации @Override.
     * Используется для указания, что метод переопределяет метод суперкласса.
     */
    static class Parent {
        void show() {
            System.out.println("Метод суперкласса");
        }
    }

    static class Child extends Parent {

        /**
         * @Override помогает компилятору проверить корректность переопределения.
         * Если метод не соответствует сигнатуре суперкласса, компилятор выдаст ошибку.
         */
        @Override
        void show() {
            System.out.println("Переопределенный метод в подклассе");
        }
    }

    /**
     * Пример аннотации @Deprecated.
     * Указывает, что метод устарел и его использование не рекомендуется.
     */
    static class OldClass {

        @Deprecated
        void oldMethod() {
            System.out.println("Этот метод устарел, лучше не использовать");
        }
    }

    /**
     * Пример аннотации @SuppressWarnings.
     * Используется для подавления предупреждений компилятора.
     */
    static class WarningExample {

        @SuppressWarnings({"unchecked", "rawtypes"})
        void doSomething() {
            // Пример небезопасного приведения типов
            java.util.List list = new java.util.ArrayList();
            list.add("строка");
            java.util.List<String> strings = list; // без предупреждения компилятора
            System.out.println(strings);
        }
    }

    public static void main(String[] args) {
        // Демонстрация @Override
        Child child = new Child();
        child.show();

        // Демонстрация @Deprecated
        OldClass old = new OldClass();
        old.oldMethod(); // вызов помеченного метода

        // Демонстрация @SuppressWarnings
        WarningExample example = new WarningExample();
        example.doSomething();
    }
}
