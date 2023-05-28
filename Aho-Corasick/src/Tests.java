import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tests {
    // метод, создающий радомные строки в указанном алфавите по выбранному размеру
    static public void givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect() {
        int leftLimit = 97; // letter 'a' - 97
        int rightLimit = 99; // letter 'z' - 122
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
                .limit(targetStringLength)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        System.out.println(generatedString);
    }
    // todo !!! Нужный метод, создает одинаковые строки в заданном количестве
    static public String repeatedValueGenerator(String text, int count) {
        return Stream.generate(() -> text)
                .limit(count).collect(Collectors.joining());
    }



    public static void main(String[] args) {
        givenUsingJava8_whenGeneratingRandomAlphabeticString_thenCorrect();
        System.out.println(repeatedValueGenerator("test", 3));
    }
}
