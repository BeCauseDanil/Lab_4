import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set; /**
 * Processes the text and finds the longest palindromes.
 */
public class PalindromeProcessor {

    /**
     * Finds all longest palindromes in a text.
     * @param text The text object to process.
     * @return An array of the longest palindromes.
     */
    public String[] findAllLongestPalindromes(Text text) {
        List<String> longestPalindromes = new ArrayList<>();
        int maxLength = 0;

        for (Sentence sentence : text.getSentences()) {
            for (Object element : sentence.getElements()) {
                if (element instanceof Word) {
                    String word = ((Word) element).getWord().toLowerCase();
                    if (isPalindrome(word)) {
                        if (word.length() > maxLength) {
                            maxLength = word.length();
                            longestPalindromes.clear();
                            longestPalindromes.add(word);
                        } else if (word.length() == maxLength) {
                            longestPalindromes.add(word);
                        }
                    }
                }
            }
        }

        // Remove duplicates
        Set<String> uniquePalindromes = new LinkedHashSet<>(longestPalindromes);
        return uniquePalindromes.toArray(new String[0]);
    }

    /**
     * Checks if a word is a palindrome.
     * @param word The word to check.
     * @return True if the word is a palindrome, false otherwise.
     */
    private boolean isPalindrome(String word) {
        int i = 0, j = word.length() - 1;
        while (i < j) {
            if (word.charAt(i++) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
