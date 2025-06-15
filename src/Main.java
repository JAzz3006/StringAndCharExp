import java.util.Arrays;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        String test = "qwe^_) rTy:~#";
//        test.codePoints()
//                .mapToObj(cp -> new String(Character.toChars(cp)))
//                .map(UniCodeUtil::lineBuilder)
//                .forEach(System.out::println);
        //limitedStream();
        //stringToStream("whatever you want");
        char[] chars = {'H', 'e', 'l', 'l', 'o'};
        String result = String.copyValueOf(chars, 0, chars.length - 4);
        String exp = "screw you";
        String exp1 = "Whatever";
        int i = 5;

        System.out.printf("%s guys I'm going home - %d", exp, i);




    }

    public static void limitedStream(){
        Stream.iterate(0, i -> i+1)
                .limit(200000)
                .filter(UniCodeUtil::isEmoji)
                .map(UniCodeUtil::lineBuilder)
                .forEach(System.out::println);

    }
    public static void stringToStream (String s){
        Stream.iterate(0, i -> i + 1)
                .limit(s.length())
                .map(s::charAt)
                .forEach(System.out::println);
    }
    public static String getRandomEmoji(){
        return String.valueOf(Character.toChars(129321));
    }
}