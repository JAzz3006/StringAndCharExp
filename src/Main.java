import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        String test = "qwe^_) rTy:~#";
        test.codePoints()
                .mapToObj(cp -> new String(Character.toChars(cp)))
                .map(UniCodeUtil::lineBuilder)
                .forEach(System.out::println);
        limitedStream();
    }

    public static void limitedStream(){
        Stream.iterate(100, i -> i+1)
                .limit(10)
                .forEach(System.out::println);

    }
}