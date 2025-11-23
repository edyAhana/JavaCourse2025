/**
 * Класс AccessModifiersDemo демонстрирует работу различных спецификаторов доступа
 * в Java: private, default, protected, public.
 */
public class AccessModifiersDemo {

    private int privateVar = 1;        // доступ только внутри этого класса
    int defaultVar = 2;                // доступ внутри того же пакета
    protected int protectedVar = 3;    // доступ внутри пакета и у подклассов
    public int publicVar = 4;          // доступ из любого класса

    private void privateMethod() {
        System.out.println("privateMethod, privateVar = " + privateVar);
    }

    void defaultMethod() {
        System.out.println("defaultMethod, defaultVar = " + defaultVar);
    }

    protected void protectedMethod() {
        System.out.println("protectedMethod, protectedVar = " + protectedVar);
    }

    public void publicMethod() {
        System.out.println("publicMethod, publicVar = " + publicVar);
    }

    /**
     * Основной метод программы.
     * Показывает доступ к членам класса внутри того же класса.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        AccessModifiersDemo obj = new AccessModifiersDemo();

        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();

        System.out.println("privateVar = " + obj.privateVar);
        System.out.println("defaultVar = " + obj.defaultVar);
        System.out.println("protectedVar = " + obj.protectedVar);
        System.out.println("publicVar = " + obj.publicVar);
    }
}
