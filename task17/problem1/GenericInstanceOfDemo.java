/**
 * Класс GenericInstanceOfDemo демонстрирует применение оператора instanceof
 * для объектов параметризованных классов.
 */
public class GenericInstanceOfDemo {

    /**
     * Класс-оболочка Wrapper с generic-параметром T.
     */
    static class Wrapper<T> {
        private T item;

        public void setItem(T item) {
            this.item = item;
        }

        public T getItem() {
            return item;
        }
    }

    /**
     * Основной метод программы.
     * Демонстрирует использование instanceof с generic-объектами.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Wrapper<Integer> intWrapper = new Wrapper<>();
        Wrapper<String> strWrapper = new Wrapper<>();

        System.out.println("intWrapper instanceof Wrapper<?> -> " + (intWrapper instanceof Wrapper<?>));
        System.out.println("strWrapper instanceof Wrapper<?> -> " + (strWrapper instanceof Wrapper<?>));

        // instanceof с конкретным generic-типа запрещен (не скомпилируется)
        // System.out.println(intWrapper instanceof Wrapper<Integer>); // ошибка компиляции

        // instanceof с родительским классом работает
        System.out.println(intWrapper instanceof Object);
        System.out.println(strWrapper instanceof Object);
    }
}
