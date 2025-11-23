/**
 * Класс SwitchFallThroughDemo демонстрирует "провал" (fall-through) в switch,
 * когда отсутствует оператор break.
 */
public class SwitchFallThroughDemo {

    /**
     * Основной метод программы.
     * Показывает, как значение переменной изменяется при отсутствии break.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int value = 2;
        int i = 0;

        switch (value) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
            case 3:
                i = 3;
                break;
            default:
                i = 4;
        }

        System.out.println("i = " + i);
    }
}

// Объяснение
// value = 2 → выполняется case 2:
// Так как нет break после case 2, выполнение падает вниз (fall-through) и выполняется код case 3:
// В результате i сначала присваивается 2, а затем 3
// Конечный результат: i = 3