/**
 * Класс EnumDemo демонстрирует инициализацию элементов перечисления (enum)
 * с дополнительными полями и методами.
 */
public class EnumDemo {

    /**
     * Перечисление Day с дополнительным полем description.
     */
    public enum Day {
        MONDAY("Начало недели"),
        TUESDAY("Вторник"),
        WEDNESDAY("Среда"),
        THURSDAY("Четверг"),
        FRIDAY("Пятница"),
        SATURDAY("Суббота"),
        SUNDAY("Воскресенье");

        private final String description;

        // Конструктор для инициализации элемента enum
        Day(String description) {
            this.description = description;
        }

        // Метод для получения описания дня
        public String getDescription() {
            return description;
        }
    }

    /**
     * Основной метод программы.
     * Демонстрирует использование и вывод элементов enum.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Day today = Day.FRIDAY;

        System.out.println("Сегодня: " + today);
        System.out.println("Описание: " + today.getDescription());

        switch (today) {
            case MONDAY:
                System.out.println("Начинаем новую неделю!");
                break;
            case FRIDAY:
                System.out.println("Пятница! Время отдыхать.");
                break;
            default:
                System.out.println("Обычный день.");
                break;
        }
    }
}
