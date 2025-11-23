/**
 * Класс DecodeDemo демонстрирует использование метода decode() классов-оболочек
 * для преобразования строковых представлений чисел в объекты соответствующего типа.
 */
public class DecodeDemo {

    /**
     * Основной метод программы.
     * Показывает работу Integer.decode() с разными форматами чисел.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        Integer dec1 = Integer.decode("12");
        Integer dec2 = Integer.decode("0xC");
        Integer dec3 = Integer.decode("014"); 
        Integer dec4 = Integer.decode("-0xA");

        System.out.println("Integer.decode(\"12\") -> " + dec1);
        System.out.println("Integer.decode(\"0xC\") -> " + dec2);
        System.out.println("Integer.decode(\"014\") -> " + dec3);
        System.out.println("Integer.decode(\"-0xA\") -> " + dec4);

        Long longValue = Long.decode("0x10");
        System.out.println("Long.decode(\"0x10\") -> " + longValue);

        Short shortValue = Short.decode("020");
        System.out.println("Short.decode(\"020\") -> " + shortValue);

        Byte byteValue = Byte.decode("0x7F");
        System.out.println("Byte.decode(\"0x7F\") -> " + byteValue);
    }
}
