/**
 * Класс ArrayAssignmentDemo демонстрирует присваивание массивов
 * и поведение ссылок на динамическую память.
 */
public class ArrayAssignmentDemo {

    /**
     * Основной метод программы.
     * Показывает, как присвоение одного массива другому меняет ссылку.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};

        System.out.println("a1 до присваивания:");
        for (int val : a1) {
            System.out.print(val + " ");
        }
        System.out.println();

        a1 = a2;

        System.out.println("a1 после присваивания a1 = a2:");
        for (int val : a1) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
