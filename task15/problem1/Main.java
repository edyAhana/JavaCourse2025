public class A {
    {
        System.out.println("logic (1) id= " + this.id);
    }

    static {
        System.out.println("static logic");
    }

    private int id = 1;

    public A(int id) {
        this.id = id;
        System.out.println("ctor id= " + id);
    }

    {
        System.out.println("logic (2) id= " + id);
    }
}

public class Main {
    public static void main(String[] args) {
        new A(100);
    }
}

// Статический блок выполняется один раз при загрузке класса.
// Логические блоки выполняются при создании объекта до конструктора, в порядке объявления.
// Инициализация полей выполняется между логическими блоками (по порядку объявления).
// Конструктор выполняется после всех логических блоков и инициализаций.
// В логическом блоке (1) id ещё не инициализирован → 0.
// В логическом блоке (2) id уже = 1.
// В конструкторе поле присваивается значением 100.