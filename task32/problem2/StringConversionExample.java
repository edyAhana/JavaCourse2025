/**
 * Демонстрация преобразования между String, StringBuilder и StringBuffer.
 */
public class StringConversionExample {

    public static void main(String[] args) {

        // 1. String -> StringBuilder
        String str = "Hello World";
        StringBuilder sb = new StringBuilder(str);
        System.out.println("String -> StringBuilder: " + sb);

        // 2. String -> StringBuffer
        StringBuffer sbf = new StringBuffer(str);
        System.out.println("String -> StringBuffer: " + sbf);

        // 3. StringBuilder -> String
        String strFromSb = sb.toString();
        System.out.println("StringBuilder -> String: " + strFromSb);

        // 4. StringBuffer -> String
        String strFromSbf = sbf.toString();
        System.out.println("StringBuffer -> String: " + strFromSbf);

        // 5. StringBuilder -> StringBuffer
        StringBuffer sbfFromSb = new StringBuffer(sb.toString());
        System.out.println("StringBuilder -> StringBuffer: " + sbfFromSb);

        // 6. StringBuffer -> StringBuilder
        StringBuilder sbFromSbf = new StringBuilder(sbf.toString());
        System.out.println("StringBuffer -> StringBuilder: " + sbFromSbf);

        // Дополнительно: цепочка преобразований
        StringBuilder sbChain = new StringBuilder(new StringBuffer(str).toString());
        System.out.println("Цепочка преобразований: String -> StringBuffer -> String -> StringBuilder: " + sbChain);
    }
}
