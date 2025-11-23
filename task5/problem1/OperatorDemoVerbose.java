/**
 * Класс OperatorDemoVerbose демонстрирует работу всех основных операторов
 * Java с базовыми типами и строками, с наглядным выводом каждого результата.
 */
public class OperatorDemoVerbose {

    /**
     * Основной метод программы.
     * Показывает примеры использования арифметических, логических,
     * побитовых, присваивания и строковых операторов.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        double x = 2.5;
        double y = 1.5;
        boolean bool1 = true;
        boolean bool2 = false;
        String s1 = "Hello";
        String s2 = "World";

        System.out.println("Присваивание:");
        a = b;
        System.out.println("a = b -> a = " + a);

        System.out.println("\nОператоры +=, -=, *=, /=, %=");
        a += 2; System.out.println("a += 2 -> " + a);
        a -= 1; System.out.println("a -= 1 -> " + a);
        a *= 2; System.out.println("a *= 2 -> " + a);
        a /= 3; System.out.println("a /= 3 -> " + a);
        a %= 2; System.out.println("a %= 2 -> " + a);

        System.out.println("\nТернарный оператор ?:");
        int max = (a > b) ? a : b;
        System.out.println("max = (a > b) ? a : b -> " + max);

        System.out.println("\nЛогические операторы || и &&");
        System.out.println("bool1 || bool2 -> " + (bool1 || bool2));
        System.out.println("bool1 && bool2 -> " + (bool1 && bool2));

        System.out.println("\nПобитовые операторы |, ^, &");
        System.out.println("bool1 | bool2 -> " + (bool1 | bool2));
        System.out.println("bool1 ^ bool2 -> " + (bool1 ^ bool2));
        System.out.println("bool1 & bool2 -> " + (bool1 & bool2));

        System.out.println("\nОператоры == и !=");
        System.out.println("a == b -> " + (a == b));
        System.out.println("a != b -> " + (a != b));

        System.out.println("\nСдвиги: >>, <<, >>>");
        System.out.println("a >> 1 -> " + (a >> 1));
        System.out.println("b << 2 -> " + (b << 2));
        System.out.println("a >>> 1 -> " + (a >>> 1));

        System.out.println("\nАрифметические +, -, *, /, %");
        System.out.println("a + b -> " + (a + b));
        System.out.println("a - b -> " + (a - b));
        System.out.println("a * b -> " + (a * b));
        System.out.println("x / y -> " + (x / y));
        System.out.println("a % b -> " + (a % b));

        System.out.println("\nИнкремент и декремент ++ и --");
        System.out.println("Префикс ++a -> " + (++a));
        System.out.println("Постфикс b++ -> " + (b++));
        System.out.println("Префикс --a -> " + (--a));
        System.out.println("Постфикс b-- -> " + (b--));

        System.out.println("\nПобитовое NOT ~ и логическое NOT !");
        System.out.println("~a -> " + (~a));
        System.out.println("!bool1 -> " + (!bool1));

        System.out.println("\nКонкатенация строк + и +=");
        System.out.println("s1 + \" \" + s2 -> " + (s1 + " " + s2));
        s1 += s2;
        System.out.println("s1 += s2 -> " + s1);
    }
}
