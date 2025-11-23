/**
 * Класс MethodDemo демонстрирует перегрузку и переопределение методов.
 */
public class MethodDemo {

    /**
     * Перегруженный метод greet без параметров.
     */
    public void greet() {
        System.out.println("Привет!");
    }

    /**
     * Перегруженный метод greet с одним параметром.
     * @param name имя для приветствия
     */
    public void greet(String name) {
        System.out.println("Привет, " + name + "!");
    }

    /**
     * Основной метод программы.
     * Показывает использование перегрузки и переопределения методов.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        MethodDemo demo = new MethodDemo();
        demo.greet();          
        demo.greet("Фёдор");   

        Animal animal = new Animal();
        animal.sound();        

        Dog dog = new Dog();
        dog.sound();           
    }
}

/**
 * Суперкласс Animal для демонстрации переопределения методов.
 */
class Animal {
    public void sound() {
        System.out.println("Животное издает звук");
    }
}

/**
 * Подкласс Dog переопределяет метод sound суперкласса Animal.
 */
class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Собака гавкает");
    }
}
