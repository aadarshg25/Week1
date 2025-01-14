import java.util.Scanner;

public class SplitSentence {

    public static String[] splitText(String text) {
        text = text.trim();
        String word = "";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') {
                count++;
            }
        }
        count++; // last word

        String[] words = new String[count];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else if (text.charAt(i) == ' ' && text.charAt(i - 1) != ' ') { // dont want internal spaces
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word; // Add last word
        return words;
    }

    public static int findLength(String text) {
        int length = 0;
        for (char c : text.toCharArray()) {
            length++;
        }
        return length;
    }

    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String inputText = input.nextLine();

        String[] words = splitText(inputText);
        String[][] wordLengths = wordsWithLengths(words);

        System.out.println("Word \t\tLength");
        System.out.println("-------------------");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + " \t\t" + Integer.parseInt(wordLength[1]));
        }

        input.close();
    }
}