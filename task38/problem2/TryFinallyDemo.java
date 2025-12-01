/**
 * Демонстрация использования конструкции try с только finally.
 */
public class TryFinallyDemo {

    /**
     * Главный метод.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        try {
            System.out.println("Внутри try-блока.");
            int result = 10 / 0; // ArithmeticException
        } finally {
            System.out.println("Блок finally выполнится всегда, даже если произошло исключение.");
        }

        // Этот код не выполнится, если исключение не обработано выше
        System.out.println("Программа завершилась бы здесь, если бы исключение было обработано.");
    }
}
// Объяснение работы

// В блоке try генерируется ArithmeticException.
// Блок finally выполняется всегда, независимо от исключения.
// После выполнения finally исключение пробрасывается дальше, если нет catch.