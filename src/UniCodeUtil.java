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
        String type = CHAR_CATEGORIES.get(Character.getType(i));
        builder.append(type);
        return builder.toString();
    }

}
