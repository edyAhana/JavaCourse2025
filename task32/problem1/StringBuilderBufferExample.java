/**
 * Демонстрация работы десяти методов классов StringBuilder и StringBuffer.
 */
public class StringBuilderBufferExample {

    public static void main(String[] args) {

        // StringBuilder — не потокобезопасен, быстрее для одиночных потоков
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append(String str) — добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append: " + sb);

        // 2. insert(int offset, String str) — вставляет строку по индексу
        sb.insert(6, "Beautiful ");
        System.out.println("2. insert: " + sb);

        // 3. delete(int start, int end) — удаляет символы в диапазоне [start, end)
        sb.delete(6, 16);
        System.out.println("3. delete: " + sb);

        // 4. deleteCharAt(int index) — удаляет символ по индексу
        sb.deleteCharAt(5);
        System.out.println("4. deleteCharAt: " + sb);

        // 5. replace(int start, int end, String str) — заменяет диапазон символов на строку
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sb);

        // 6. reverse() — переворачивает последовательность символов
        sb.reverse();
        System.out.println("6. reverse: " + sb);

        // 7. charAt(int index) — возвращает символ по индексу
        System.out.println("7. charAt(0): " + sb.charAt(0));

        // 8. setCharAt(int index, char ch) — изменяет символ по индексу
        sb.setCharAt(0, 'h');
        System.out.println("8. setCharAt: " + sb);

        // 9. length() — возвращает текущую длину
        System.out.println("9. length: " + sb.length());

        // 10. capacity() — возвращает текущую вместимость буфера
        System.out.println("10. capacity: " + sb.capacity());

        System.out.println("\n--- StringBuffer аналогично ---");

        // StringBuffer — потокобезопасен
        StringBuffer sbf = new StringBuffer("Java");

        sbf.append(" Programming");    
        sbf.insert(5, "Language ");    
        sbf.delete(5, 14);             
        sbf.deleteCharAt(0);           
        sbf.replace(0, 4, "Python");   
        sbf.reverse();                 
        System.out.println("StringBuffer final: " + sbf);
    }
}
