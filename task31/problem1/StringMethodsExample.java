/**
 * Демонстрация работы десяти методов класса String.
 */
public class StringMethodsExample {

    public static void main(String[] args) {
        String str1 = "  Hello World  ";
        String str2 = "Java Programming";
        String str3 = "HELLO WORLD";

        // 1. length() - возвращает длину строки
        System.out.println("Длина str1: " + str1.length());

        // 2. charAt(int index) - возвращает символ по индексу
        System.out.println("Символ по индексу 1 в str1: " + str1.charAt(1));

        // 3. substring(int beginIndex, int endIndex) - возвращает подстроку
        System.out.println("Подстрока str2 (5, 16): " + str2.substring(5, 16));

        // 4. toLowerCase() - возвращает строку в нижнем регистре
        System.out.println("str2 в нижнем регистре: " + str2.toLowerCase());

        // 5. toUpperCase() - возвращает строку в верхнем регистре
        System.out.println("str2 в верхнем регистре: " + str2.toUpperCase());

        // 6. trim() - удаляет начальные и конечные пробелы
        System.out.println("str1 после trim(): '" + str1.trim() + "'");

        // 7. replace(CharSequence target, CharSequence replacement) - заменяет подстроку
        System.out.println("str2 после замены 'Java' на 'Python': " + str2.replace("Java", "Python"));

        // 8. contains(CharSequence s) - проверяет наличие подстроки
        System.out.println("str2 содержит 'Programming'? " + str2.contains("Programming"));

        // 9. equals(Object obj) - сравнение строк с учетом регистра
        System.out.println("str1.equals(str3)? " + str1.equals(str3));

        // 10. equalsIgnoreCase(String anotherString) - сравнение без учета регистра
        System.out.println("str1.equalsIgnoreCase(str3)? " + str1.equalsIgnoreCase(str3));
    }
}
