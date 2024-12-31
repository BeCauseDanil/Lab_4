import java.util.ArrayList;
import java.util.List; /**
 * Represents a word, which consists of an array of letters.
 */
public class Word {
    private final List<Letter> letters;

    public Word(String word) {
        this.letters = new ArrayList<>();
        for (char ch : word.toCharArray()) {
            letters.add(new Letter(ch));
        }
    }

    public String getWord() {
        StringBuilder sb = new StringBuilder();
        for (Letter letter : letters) {
            sb.append(letter.getCharacter());
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return getWord();
    }
}
