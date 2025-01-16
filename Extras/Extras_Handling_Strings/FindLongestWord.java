import java.util.Scanner;

public class FindLongestWord {

    public static String findLongestWord(String sentence) {
        String[] words = sentence.split(" ");
        String largestWord = "";
        int largest = -1;
        for (String word : words) {
            if (word.length() > largest) {
                largestWord = word;
                largest = word.length();
            }
        }

        return largestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        System.out.println("The longest word is: " + findLongestWord(sentence));
    }
}
