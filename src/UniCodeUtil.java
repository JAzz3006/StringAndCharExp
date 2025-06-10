import java.util.HashMap;
import java.util.Map;

public class UniCodeUtil {
    public static final Map<Integer, String> CHAR_CATEGORIES =  new HashMap<Integer, String>(){{
        put((int) Character.UNASSIGNED, "Неопределённый символ");
        put((int) Character.UPPERCASE_LETTER, "Прописная буква");
        put((int) Character.LOWERCASE_LETTER, "Строчная буква");
        put((int) Character.TITLECASE_LETTER, "Буква с заглавным начертанием");
        put((int) Character.MODIFIER_LETTER, "Модификаторная буква");
        put((int) Character.OTHER_LETTER, "Другая буква");
        put((int) Character.NON_SPACING_MARK, "Неразрывный надстрочный/подстрочный знак");
        put((int) Character.ENCLOSING_MARK, "Обрамляющий диакритический знак");
        put((int) Character.COMBINING_SPACING_MARK, "Комбинируемый знак с интервалом");
        put((int) Character.DECIMAL_DIGIT_NUMBER, "Десятичная цифра");
        put((int) Character.LETTER_NUMBER, "Буквенная цифра");
        put((int) Character.OTHER_NUMBER, "Прочее число");
        put((int) Character.SPACE_SEPARATOR, "Пробельный разделитель");
        put((int) Character.LINE_SEPARATOR, "Разделитель строк");
        put((int) Character.PARAGRAPH_SEPARATOR, "Разделитель абзацев");
        put((int) Character.CONTROL, "Управляющий символ");
        put((int) Character.FORMAT, "Форматирующий символ");
        put((int) Character.PRIVATE_USE, "Символ частного использования");
        put((int) Character.SURROGATE, "Суррогатный символ");
        put((int) Character.DASH_PUNCTUATION, "Тире");
        put((int) Character.START_PUNCTUATION, "Открывающий знак препинания");
        put((int) Character.END_PUNCTUATION, "Закрывающий знак препинания");
        put((int) Character.CONNECTOR_PUNCTUATION, "Соединительный знак препинания");
        put((int) Character.OTHER_PUNCTUATION, "Прочий знак препинания");
        put((int) Character.MATH_SYMBOL, "Математический символ");
        put((int) Character.CURRENCY_SYMBOL, "Символ валюты");
        put((int) Character.MODIFIER_SYMBOL, "Модификаторный символ");
        put((int) Character.OTHER_SYMBOL, "Прочий символ");
    }};

        public static String lineBuilder(String s){
        StringBuilder builder = new StringBuilder();
        builder.append(s).append(" - ");
        int i = s.codePointAt(0);
        builder.append(i).append(" - ");
        int typeCode = Character.getType(i);
        String type = CHAR_CATEGORIES.get(typeCode);
        builder.append(type);
        return builder.toString();
    }
    public static String lineBuilder(int cp){
            StringBuilder builder = new StringBuilder();
            builder.append(cp).append(" - ");
            String symbol = new String(Character.toChars(cp));
            builder.append(symbol).append(" - ");
            int typeCode = Character.getType(cp);
            String type = CHAR_CATEGORIES.get(typeCode);
            builder.append(type);
            return builder.toString();
    }
    public static boolean isEmoji(int codePoint) {
        return (codePoint >= 0x1F600 && codePoint <= 0x1F64F)     // Emoticons
                || (codePoint >= 0x1F300 && codePoint <= 0x1F5FF)     // Misc Symbols and Pictographs
                || (codePoint >= 0x1F680 && codePoint <= 0x1F6FF)     // Transport and Map
                || (codePoint >= 0x1F900 && codePoint <= 0x1F9FF)     // Supplemental Symbols and Pictographs
                || (codePoint >= 0x1FA70 && codePoint <= 0x1FAFF)     // Symbols and Pictographs Extended-A
                || (codePoint >= 0x2600 && codePoint <= 0x26FF)       // Misc symbols (includes ☀, ☁)
                || (codePoint >= 0x2700 && codePoint <= 0x27BF);      // Dingbats (includes ✂, ✈)
    }

}
