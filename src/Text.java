import java.util.ArrayList;
import java.util.List; /**
 * Represents a text, which consists of sentences.
 */
public class Text {
    private final List<Sentence> sentences;

    public Text(String rawText) {
        sentences = new ArrayList<>();
        rawText = rawText.replaceAll("\\s+", " "); // Replace tabs and spaces with a single space
        String[] sentenceParts = rawText.split("(?<=[.!?])\\s*");
        for (String part : sentenceParts) {
            sentences.add(new Sentence(part));
        }
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}
