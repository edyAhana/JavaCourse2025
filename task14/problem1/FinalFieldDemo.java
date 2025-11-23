/**
 * Класс FinalFieldDemo демонстрирует все варианты инициализации final-поля.
 */
public class FinalFieldDemo {

    /**
     * Пример 1: инициализация при объявлении
     */
    public final int field1 = 10;

    /**
     * Пример 2: инициализация в конструкторе
     */
    public final int field2;

    /**
     * Пример 3: инициализация в статическом блоке 
     */
    public static final int STATIC_FINAL_FIELD;

    // Статический блок инициализации
    static {
        STATIC_FINAL_FIELD = 100;
    }

    public FinalFieldDemo(int value) {
        this.field2 = value; 
    }

    /**
     * Основной метод программы.
     * Демонстрирует доступ к final-полям.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        FinalFieldDemo obj = new FinalFieldDemo(20);

        System.out.println("field1 = " + obj.field1);
        System.out.println("field2 = " + obj.field2);
        System.out.println("STATIC_FINAL_FIELD = " + STATIC_FINAL_FIELD);
    }
}
