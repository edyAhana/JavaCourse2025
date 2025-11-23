import java.util.ArrayList;
import java.util.List;

/**
 * Класс WildcardDemo демонстрирует использование wildcard-типов:
 * <? extends T> и <? super T>.
 */
public class WildcardDemo {

    /**
     * Основной метод программы.
     * Показывает примеры ковариантности и контравариантности коллекций.
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        List<? extends Number> numsExtends = new ArrayList<Integer>();
        Number n = numsExtends.isEmpty() ? null : numsExtends.get(0); 

        List<? super Integer> numsSuper = new ArrayList<Number>();
        numsSuper.add(10);
        numsSuper.add(20);
        Object obj = numsSuper.get(0);
    }
}
// Объяснение

// <? extends T> (ковариантность)
// Ограничивает тип сверху (T и его подклассы).
// Можно читать элементы как T, но нельзя безопасно добавлять новые элементы (кроме null).
// Применяется, когда нужен доступ только для чтения.

// <? super T> (контравариантность)
// Ограничивает тип снизу (T и его суперклассы).
// Можно добавлять элементы типа T и подтипов, но при чтении можно использовать только Object.
// Применяется, когда нужна запись в коллекцию, но не важен точный тип при чтении.