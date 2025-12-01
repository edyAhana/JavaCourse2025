import java.io.FileInputStream;
import java.io.IOException;

/**
 * Демонстрация работы метода read() класса FileInputStream.
 * FileInputStream — это подкласс InputStream для чтения байтов из файла.
 */
public class FileInputStreamDemo {

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Укажите путь к существующему файлу 
        String filePath = "example.txt";

        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteRead;

            System.out.println("Содержимое файла побайтово:");

            while ((byteRead = fis.read()) != -1) {
                System.out.print((char) byteRead);
            }

        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }
}
