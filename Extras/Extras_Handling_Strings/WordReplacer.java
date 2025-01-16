import java.util.Scanner;

public class WordReplacer {

    // replace a word with another word in a sentence
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        // Split the sentence into words
        String[] words = sentence.split(" ");
        String result = "";

        for (String word : words) {
            // If the current word matches the old word, replace it
            if (word.equals(oldWord)) {
                result += newWord + " ";
            } else {
                result += word + " ";
            }
        }

        // Trim the trailing space and return the modified sentence
        return result.trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence : ");
        String sentence = input.nextLine();

        System.out.print("Enter the word to replace : ");
        String oldWord = input.nextLine();

        System.out.println("Enter the new word:");
        String newWord = input.nextLine();

        String modifiedSentence = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
        input.close();
    }
}
