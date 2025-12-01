/**
 * Демонстрация интерфейса AutoCloseable и try-with-resources.
 */
public class AutoCloseableDemo {

    /**
     * Главный метод программы.
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        // Создаём объект, который реализует AutoCloseable
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
    }
}

/**
 * Пользовательский ресурс, реализующий AutoCloseable.
 */
class MyResource implements AutoCloseable {

    /**
     * Конструктор ресурса.
     */
    public MyResource() {
        System.out.println("Ресурс создан");
    }

    /**
     * Пример метода ресурса.
     */
    public void doSomething() {
        System.out.println("Ресурс что-то делает...");
    }

    /**
     * Метод close() будет автоматически вызван при завершении try-with-resources.
     */
    @Override
    public void close() {
        System.out.println("Ресурс закрыт автоматически");
    }
}
// Зачем нужен AutoCloseable:

// 1)Автоматическое закрытие ресурсов.

//     Любой ресурс, который реализует AutoCloseable, можно использовать в try-with-resources, и Java гарантирует его автоматическое закрытие после завершения блока try, даже если произошло исключение.

// 2)Избежание утечек ресурсов

//     Файлы, потоки, соединения с базой данных, сетевые сокеты — все эти ресурсы должны быть закрыты после использования.

//     Раньше приходилось явно писать try-finally, сейчас достаточно try-with-resources.

// 3)Упрощение кода
