import java.util.Scanner;

public class SubstringOccurrences {

    // Method to count occurrences of a substring in a string
    public static int countSubstringOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;

        // Find occurrences of the substring
        while (true) {
            index = str.indexOf(substring, index); // Find next occurrence
            if (index == -1) { // If no more occurrences, exit loop
                break;
            }
            count++;
            index += substring.length(); // Move past the current match
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the main string : ");
        String str = input.nextLine();
        System.out.print("Enter the substring to count : ");
        String substring = input.nextLine();

        int occurrences = countSubstringOccurrences(str, substring);

        System.out.println("The substring \"" + substring + "\" occurs " + occurrences + " times.");
    }
}
