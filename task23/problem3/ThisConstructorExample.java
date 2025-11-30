/**
 * Демонстрация использования ключевого слова this() для вызова других конструкторов
 * текущего класса. Это позволяет избегать дублирования кода.
 */
public class ThisConstructorExample {

    int a;
    int b;
    int c;
    int z;

    /**
     * Конструктор без параметров.
     * Инициализирует z = 1.
     */
    public A() {
        z = 1; 
    }

    /**
     * Конструктор с одним параметром.
     * Вызывает конструктор без параметров для инициализации z.
     *
     * @param a значение для поля a
     */
    public A(int a) {
        this();   
        this.a = a;
    }

    /**
     * Конструктор с двумя параметрами.
     * Вызывает конструктор с одним параметром для инициализации a и z.
     *
     * @param a значение для поля a
     * @param b значение для поля b
     */
    public A(int a, int b) {
        this(a);  
        this.b = b;
    }

    /**
     * Конструктор с тремя параметрами.
     * Вызывает конструктор с двумя параметрами для инициализации a, b и z.
     *
     * @param a значение для поля a
     * @param b значение для поля b
     * @param c значение для поля c
     */
    public A(int a, int b, int c) {
        this(a, b);  // вызов конструктора A(int a, int b)
        this.c = c;
    }

    /**
     * Метод для вывода значений полей объекта.
     */
    public void printValues() {
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", z = " + z);
    }

    /**
     * Точка входа для демонстрации работы конструкторов.
     */
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new A(5);
        A obj3 = new A(5, 10);
        A obj4 = new A(5, 10, 15);

        obj1.printValues(); 
        obj2.printValues(); 
        obj3.printValues();
        obj4.printValues(); 
    }
}
