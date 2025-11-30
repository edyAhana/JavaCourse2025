/**
 * Демонстрация переопределения метода (overriding) и правила о возвращаемом типе.
 */
public class OverridingExample {

    /**
     * Суперкласс с методом, который будет переопределён.
     */
    static class Animal {

        /**
         * Метод, который будет переопределён в подклассе.
         * @return строка с действием животного
         */
        public String sound() {
            return "Какой-то звук";
        }
    }

    /**
     * Подкласс, переопределяющий метод sound().
     */
    static class Dog extends Animal {

        /**
         * Переопределённый метод sound().
         * @return строка с действием собаки
         */
        @Override
        public String sound() {
            return "Гав!";
        }

        /*  
         * Возвращаемые типы должны совпадать или быть ковариантными
         * (т.е. подкласс может возвращать подтип возвращаемого типа суперкласса,
         * но не совершенно другой тип).
         */
    }

    /**
     * Точка входа, демонстрирующая динамическое связывание.
     */
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        System.out.println(animal.sound()); 
        System.out.println(dog.sound());    
    }
}
