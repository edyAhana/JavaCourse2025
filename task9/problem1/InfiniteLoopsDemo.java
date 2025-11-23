/**
 * Класс InfiniteLoopsDemo демонстрирует тривиальные примеры бесконечных циклов
 * с использованием конструкций while и do-while.
 */
public class InfiniteLoopsDemo {

    /**
     * Основной метод программы.
     * Создает бесконечные циклы while и do-while.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        // Бесконечный цикл while
        int counter1 = 0;
        while (true) {
            System.out.println("while loop iteration: " + counter1);
            counter1++;
            if (counter1 >= 5) break; // ограничение для демонстрации
        }

        // Бесконечный цикл do-while
        int counter2 = 0;
        do {
            System.out.println("do-while loop iteration: " + counter2);
            counter2++;
            if (counter2 >= 5) break; // ограничение для демонстрации
        } while (true);
    }
}
