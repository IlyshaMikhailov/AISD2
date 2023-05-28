import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestsGenerate {

    static public List<String> repeatedValueGenerator(String text, int count) {
        return Stream.generate(() -> text)
                .limit(count)
                .collect(Collectors.toList());
    }

//    static public String repeatedValueGenerator(String text, int count) {
//        return Stream.generate(() -> text)
//                .limit(count).collect(Collectors.joining());
//    }

    public static void main(String[] args) {
        Random r = new Random();
        int number = 0;
        for (int i = 1; i < 31; i++) {
            number += 100;
            File myFile = new File("text" + i + ".txt");
            try {
                FileWriter writer = new FileWriter("text" + i + ".txt");
                writer.write(number + "\n");
                for (int j = 1; j <= number; j++) {
                    List<String> randomList = repeatedValueGenerator("mmk", number);
                    writer.write(String.valueOf(randomList));
//                    int randomNumber2 = r.nextInt(9900) + 100;
//                    writer.write(randomNumber2  + "\n");
                }
                writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
