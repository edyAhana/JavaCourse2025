import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода write(int) класса FileOutputStream.
 * FileOutputStream — это подкласс OutputStream для записи байтов в файл.
 */
public class FileOutputStreamDemo {

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Укажите путь к файлу
        String filePath = "output.txt";

        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String text = "Hello, OutputStream!";

            // Записываем текст побайтово
            for (char ch : text.toCharArray()) {
                fos.write(ch); 
            }

            System.out.println("Запись в файл завершена.");

        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }
}
