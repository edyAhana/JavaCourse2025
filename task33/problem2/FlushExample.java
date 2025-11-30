import java.io.FileWriter;
import java.io.IOException;

/**
 * Демонстрация работы метода flush() для потоков вывода.
 */
public class FlushExample {

    public static void main(String[] args) {
        try {
            // Создаем FileWriter для записи в файл
            FileWriter writer = new FileWriter("example.txt");

            // Записываем данные в буфер
            writer.write("Первая строка\n");
            writer.write("Вторая строка\n");

            // Данные еще могут находиться в буфере и не записаны в файл
            System.out.println("Данные записаны в буфер, но не обязательно в файл.");

            // Метод flush() сбрасывает буфер, гарантируя запись всех данных
            writer.flush();
            System.out.println("Данные сброшены из буфера в файл.");

            // После flush() можно продолжать писать
            writer.write("Третья строка\n");

            // Закрытие потока автоматически вызывает flush()
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
