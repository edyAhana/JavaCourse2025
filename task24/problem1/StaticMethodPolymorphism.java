/**
 * Демонстрация того, что статические методы не могут быть переопределены
 * и динамический полиморфизм к ним неприменим.
 */
public class StaticMethodPolymorphism {

    /**
     * Суперкласс с статическим методом.
     */
    static class A {
        public static void method() {
            System.out.println("Статический метод класса A");
        }
    }

    /**
     * Подкласс, который объявляет статический метод с таким же именем.
     * Это не переопределение, а сокрытие метода (method hiding).
     */
    static class B extends A {
        public static void method() {
            System.out.println("Статический метод класса B");
        }
    }

    /**
     * Точка входа программы для демонстрации.
     */
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        A objAB = new B();

        // Вызов статического метода через ссылку на тип переменной
        objA.method();   
        objB.method();   
        objAB.method(); 
    }
}
