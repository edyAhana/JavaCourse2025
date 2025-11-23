/**
 * Класс IntegerCacheDemo демонстрирует автоупаковку Integer,
 * сравнение через == и equals, а также работу IntegerCache.
 */
public class IntegerCacheDemo {

    /**
     * Основной метод программы.
     * Выполняет автоупаковку, сравнения объектов Integer и примитивов,
     * и выводит результаты на консоль.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int i1 = 128;
        Integer a1 = i1;
        Integer b1 = i1;
        System.out.println("a1==i1 " + (a1 == i1));
        System.out.println("b1==i1 " + (b1 == i1));
        System.out.println("a1==b1 " + (a1 == b1));
        System.out.println("a1.equals(i1) -> " + a1.equals(i1));
        System.out.println("b1.equals(i1) -> " + b1.equals(i1));
        System.out.println("a1.equals(b1) -> " + a1.equals(b1));

        int i2 = 127;
        Integer a2 = i2;
        Integer b2 = i2;
        System.out.println("a2==i2 " + (a2 == i2));
        System.out.println("b2==i2 " + (b2 == i2));
        System.out.println("a2==b2 " + (a2 == b2));
        System.out.println("a2.equals(i2) -> " + a2.equals(i2));
        System.out.println("b2.equals(i2) -> " + b2.equals(i2));
        System.out.println("a2.equals(b2) -> " + a2.equals(b2));
    }
}
// Объяснение результатов

// Для i1 = 128:
// a1 == i1 → true
// i1 — примитив int
// a1 автораспаковывается в int → сравнение значений.
// b1 == i1 → true
// a1 == b1 → false
// Оба объекта вне диапазона кеша (-128..127) → разные объекты → разные ссылки.
// a1.equals(i1) → true
// b1.equals(i1) → true
// a1.equals(b1) → true
// Для i2 = 127:
// a2 == i2 → true
// b2 == i2 → true
// a2 == b2 → true
// Обе переменные берут объект из IntegerCache → одна ссылка.
// a2.equals(i2) → true
// b2.equals(i2) → true
// a2.equals(b2) → true

// для чего нужен IntegerCache:

// Экономит память, повторно используя объекты для часто встречающихся значений (-128..127).
// Позволяет использовать == для сравнения объектов внутри кеша.
// Применяется также для Byte, Short, Long, Character в аналогичных диапазонах.