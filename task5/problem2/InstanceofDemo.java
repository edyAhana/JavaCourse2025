/**
 * Класс InstanceofDemo демонстрирует использование оператора instanceof
 * с различными типами объектов и с null.
 */
public class InstanceofDemo {

    /**
     * Основной метод программы.
     * Проверяет, является ли объект экземпляром заданного класса или его подклассов.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 123;
        Object obj3 = null;

        System.out.println("obj1 instanceof String -> " + (obj1 instanceof String));
        System.out.println("obj1 instanceof Object -> " + (obj1 instanceof Object));
        System.out.println("obj2 instanceof Integer -> " + (obj2 instanceof Integer));
        System.out.println("obj2 instanceof Number -> " + (obj2 instanceof Number));
        System.out.println("obj3 instanceof Object -> " + (obj3 instanceof Object));

        // Пример с наследованием
        Number num = 10.5;
        System.out.println("num instanceof Double -> " + (num instanceof Double));
        System.out.println("num instanceof Number -> " + (num instanceof Number));
    }
}
