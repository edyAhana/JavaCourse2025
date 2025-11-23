/**
 * Класс BreakContinueDemo демонстрирует использование операторов
 * break и continue в цикле.
 */
public class BreakContinueDemo {

    /**
     * Основной метод программы.
     * Показывает, как break завершает цикл досрочно,
     * а continue пропускает текущую итерацию.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {

        System.out.println("Пример continue:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("i = " + i);
        }

        System.out.println("\nПример break:");
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                break;
            }
            System.out.println("i = " + i);
        }
    }
}
// continue
// Пропускает текущую итерацию цикла.
// В примере i == 2 → итерация пропускается, выводим 0,1,3,4.

// break
// Прерывает цикл полностью.
// В примере i == 3 → цикл завершён, выводим 0,1,2.