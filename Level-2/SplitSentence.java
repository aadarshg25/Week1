import java.util.*;

public class SplitSentence {

    // User Defined Method
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

    // Method created
    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Sentence : ");
        String string = input.nextLine();

        String[] userDefinedSplit = splitText(string);
        String[] builtInSplit = string.split(" ");

        // Compare the two string
        boolean areArraysEqual = compareStringArrays(userDefinedSplit, builtInSplit);

        System.out.println("Are the two string arrays equal? " + areArraysEqual);

        // the words for verified
        System.out.print("User Defined Split Words : ");
        for (String word : userDefinedSplit) {
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.print("Built-in Split Words : ");
        for (String word : builtInSplit) {
            System.out.print(word + " ");
        }
    }
}
