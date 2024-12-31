import java.util.ArrayList;
import java.util.List; /**
 * Represents a sentence, which consists of words and punctuation marks.
 */
public class Sentence {
    private final List<Object> elements; // Words and punctuation marks

    public Sentence(String sentence) {
        elements = new ArrayList<>();
        String[] parts = sentence.split("(?=[.,!?])|\\s+");
        for (String part : parts) {
            if (part.matches("[.,!?]")) {
                elements.add(new Punctuation(part.charAt(0)));
            } else if (!part.isBlank()) {
                elements.add(new Word(part));
            }
        }
    }

    public List<Object> getElements() {
        return elements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object element : elements) {
            sb.append(element.toString());
            if (element instanceof Word) {
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
}
