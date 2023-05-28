import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeTask {
    public static void main(String[] args) {
        List<AhoCorasick.Entry> entryList = new ArrayList<>();

        List<String> list = Arrays.asList("he", "she", "hers", "his", "he", "she", "hers", "his");

        for (String s : list) {
            AhoCorasick.Entry entry = new AhoCorasick.Entry();
            entry.setValue(s);
            entryList.add(entry);
        }


        AhoCorasick ahoCorasick = new AhoCorasick(entryList, 26);

        ahoCorasick.solve("ahishers");
    }
}
