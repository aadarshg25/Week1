import java.util.Scanner;

public class SplitWordsLengthTwo {

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

    public static int getLength(String str) {
        int length = 0;

        for (char ch : str.toCharArray()) {
            length++;
        }

        return length;
    }

    // Method to generate a 2D array containing words and their corresponding
    // lengths
    public static String[][] getWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i];
            wordLengthArray[i][1] = String.valueOf(getLength(words[i]));
        }

        return wordLengthArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the Sentence : ");
        String string = input.nextLine();

        String[] words = splitText(string);

        String[][] wordLengthArray = getWordLengthArray(words);

        for (int i = 0; i < wordLengthArray.length; i++) {
            System.out.println(wordLengthArray[i][0] + "\t" + Integer.parseInt(wordLengthArray[i][1]));
        }

        input.close();
    }
}
