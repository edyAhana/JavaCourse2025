public class Main {
    public static void main(String[] args) {
        String s = "Привет, ";
        String name = "Фёдор";

        int age = 20;
        double height = 1.82;
        boolean isStudent = true;

        Object obj = new Object();

        String result1 = s + name;
        String result2 = "Возраст: " + age;
        String result3 = "Рост: " + height;
        String result4 = "Студент: " + isStudent;
        String result5 = "Объект: " + obj;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
    }
}
