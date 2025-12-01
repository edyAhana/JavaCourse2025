import java.io.*;

public class ReaderWriterDemo {
    public static void main(String[] args) throws IOException {
        String filePath = "text.txt";

        // Запись текста в файл через Writer
        try (Writer writer = new FileWriter(filePath)) {
            writer.write("Привет, мир!");
        }

        // Чтение текста через Reader
        try (Reader reader = new FileReader(filePath)) {
            int ch;
            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }
        }
    }
}

// Причина появления Reader и Writer:

// Работают с символами (char) и строками (String).

// Учитывают кодировку текста автоматически (при использовании InputStreamReader и OutputStreamWriter).

// Позволяют легко читать/писать текстовые данные, строки и символы, без ручного преобразования байтов.