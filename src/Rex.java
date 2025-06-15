import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Rex {
    public static void main(String[] args) {
        String regex = "([А-ЯЁа-яё]+(?: [А-ЯЁа-яё]+){1,2})\\s+—\\s+\\+7 \\((\\d{3})\\) (\\d{3})-(\\d{2})-(\\d{2})";
        String input ="Контакты:\n" +
                "Иванов Иван Иванович — +7 (912) 345-67-89\n" +
                "Петрова Мария Сергеевна — +7 (495) 123-45-67\n" +
                "Смирнов Алексей — +7 (812) 111-22-33\n";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE
                | Pattern.UNICODE_CHARACTER_CLASS
                | Pattern.UNICODE_CASE);
        Matcher matcher = pattern.matcher(input);
        matcher.results()
                .forEach(mr -> System.out.println(
                        "ФИО: " + mr.group(1) +
                        "\nкод: " + mr.group(2) +
                        "\nтелефон: " + mr.group(3) + "-" + mr.group(4) + "-" + mr.group(5) + "\n"
                        )
                );
        String result = "Today is %1$td.%1$tm.%1$tY - local time is %1$tH:%1$tM".formatted(LocalDateTime.now());
        //System.out.println(result);
        String template = "Имя: %-10s | Счет: %,.2f | Дата: %3$td.%3$tm.%3$tY";
        System.out.println(template.formatted("Грег", 123456.789, LocalDateTime.now()));
        getKodirovochka();

    }
    public static void getKodirovochka(){
        Charset defaultCharset = Charset.defaultCharset();
        System.out.println(defaultCharset.name());
    }

}
