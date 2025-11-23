/**
 * Класс CustomEnumDemo демонстрирует создание собственного enum с дополнительным методом.
 */
public class CustomEnumDemo {

    /**
     * Перечисление Planet с полями mass и radius, а также методом для расчёта гравитации.
     */
    public enum Planet {
        MERCURY(3.303e+23, 2.4397e6),
        VENUS(4.869e+24, 6.0518e6),
        EARTH(5.976e+24, 6.37814e6),
        MARS(6.421e+23, 3.3972e6);

        private final double mass;   
        private final double radius; 

        // Конструктор для инициализации элементов
        Planet(double mass, double radius) {
            this.mass = mass;
            this.radius = radius;
        }

        /**
         * Метод для расчёта силы тяжести на поверхности планеты.
         * @return ускорение свободного падения (m/s^2)
         */
        public double surfaceGravity() {
            final double G = 6.67300E-11; 
            return G * mass / (radius * radius);
        }
    }

    /**
     * Основной метод программы.
     * Демонстрирует использование enum с дополнительным методом.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        for (Planet p : Planet.values()) {
            System.out.printf("Гравитация на %s = %.2f m/s^2%n", p, p.surfaceGravity());
        }
    }
}
