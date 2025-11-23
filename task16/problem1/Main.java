public class A {
    public void printNum(Integer i)
    {
        System.out.printf("Integer = %d%n", i);
    }
    public void printNum(int i)
    {
        System.out.printf("int = %d%n", i);
    }
    public void printNum(Float f)
    {
        System.out.printf("Float = %.4f%n", f);
    }
    public void printNum(Number n)
    {
        System.out.println("Number=" + n);
    }
}


public class Main {
    public static void main(String[] args) {
        A a = new A();
        Number[ ] num = {new Integer(1), 11, 1.11f, 11.11 };
        // цикл for (1)
        for (Number n : num) {
            a.printNum(n);
        }
        // (2)
        a.printNum(new Integer(1));
        a.printNum(11);
        a.printNum(1.11f);
        a.printNum(11.11);
    }
}
// Что происходит в цикле for (1):
// Переменная n объявлена как Number n.
// Все элементы массива num имеют тип Number, потому что массив Number[].
// Когда вызывается a.printNum(n), компилятор **выбирает метод по статическому типу переменной n — а это Number.
// Итог: в цикле for всегда вызывается метод:
// public void printNum(Number n)
// Даже если объект внутри n — Integer или Float.
// JVM не учитывает реальный тип объекта (это динамическая диспетчеризация для нестатических методов работает только на переопределение, а не на перегрузку).

// Что происходит при прямых вызовах (2)
// a.printNum(new Integer(1)); // вызов метода printNum(Integer)
// a.printNum(11);             // int → вызов printNum(int)
// a.printNum(1.11f);          // float → вызов printNum(Float) через автоупаковку
// a.printNum(11.11);          // double → Number → вызов printNum(Number)
// Компилятор точно знает тип аргумента при компиляции → выбирается наиболее конкретный подходящий метод.
