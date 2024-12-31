import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Main class to run the program.
 */
public class Main {

    public static void main(String[] args) {
        String inputText = "аба. Таблетка! аба ба б а ба? Річка.";

        // Create a text object
        Text text = new Text(inputText);
        System.out.println("Processed Text: " + text);

        // Find palindromes
        PalindromeProcessor processor = new PalindromeProcessor();
        String[] longestPalindromes = processor.findAllLongestPalindromes(text);

        // Output the results
        System.out.println("Longest Palindromes:");
        for (String palindrome : longestPalindromes) {
            System.out.println(palindrome);
        }
    }
}
