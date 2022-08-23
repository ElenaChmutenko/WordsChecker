import java.util.HashSet;
import java.util.Set;

public class WordsChecker {
    protected String text;
    protected Set<String> words;

    public WordsChecker(String text) {
        this.text = text;
        this.words = new HashSet<>(text.length());
    }

    public boolean hasWord(String word) {
        String[] strArray = text.split("\\P{IsAlphabetic}+");
        for (String s : strArray) {
            words.add(s.toLowerCase());
        }
        if (words.contains(word.toLowerCase())) {
            return true;
        } else {
            return false;
        }
    }
}
