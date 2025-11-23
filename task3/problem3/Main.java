public class Main {
    public static void main(String[] args) {
        int a = 1;
        {
            int b = 2;
        }
        int c = a + b;
    }
}
// Переменную c невозможно вычислить, потому что b недоступна(в другой облости видимости).
// Код не компилируется, значение c не будет создано.