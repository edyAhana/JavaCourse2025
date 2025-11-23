/**
 * Класс StaticMethodDemo демонстрирует различные способы вызова статического метода.
 */
public class StaticMethodDemo {

    /**
     * Основной метод программы.
     * Показывает, как можно вызывать статический метод printVars().
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Вариант 1: вызов через имя класса
        A.printVars();

        // Вариант 2: вызов через объект (не рекомендуется, но возможно)
        A obj = new A();
        obj.printVars();

        // Вариант 3: вызов из статического метода того же класса, если A импортирован
        printVarsDirectly();
    }

    /**
     * Статический метод того же класса, вызывающий метод A.printVars().
     */
    public static void printVarsDirectly() {
        A.printVars();
    }
}

/**
 * Класс A с статическими полями и методом.
 */
class A {
    public static int a = 1;
    public static int b;

    public static void printVars() {
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
