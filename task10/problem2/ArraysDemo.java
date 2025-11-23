import java.util.Arrays;

/**
 * Класс ArraysDemo демонстрирует работу методов класса java.util.Arrays:
 * toString, binarySearch, equals, compare, sort.
 */
public class ArraysDemo {

    /**
     * Основной метод программы.
     * Показывает примеры применения методов класса Arrays.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 7};
        int[] arr2 = {5, 2, 9, 1, 7};
        int[] arr3 = {1, 2, 3};

        // toString 
        System.out.println("arr1: " + Arrays.toString(arr1));

        // sort 
        Arrays.sort(arr1);
        System.out.println("arr1 после sort: " + Arrays.toString(arr1));

        // binarySearch 
        int index = Arrays.binarySearch(arr1, 7);
        System.out.println("Индекс элемента 7 в arr1: " + index);

        // equals 
        boolean eq1 = Arrays.equals(arr1, arr2);
        boolean eq2 = Arrays.equals(arr2, arr2);
        System.out.println("arr1.equals(arr2) -> " + eq1);
        System.out.println("arr2.equals(arr2) -> " + eq2);

        // compare 
        int cmp = Arrays.compare(arr1, arr3);
        System.out.println("Arrays.compare(arr1, arr3) -> " + cmp);
    }
}
