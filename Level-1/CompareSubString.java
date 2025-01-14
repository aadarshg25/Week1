import java.util.Scanner;

public class CompareSubString {

    public static String createSubstringUsingCharAt(String string, int start, int end) {
        String newString = "";
        for (int i = start; i < end; i++) {
            newString += string.charAt(i);
        }
        return newString;
    }

    public static String createSubstringUsingBuiltIn(String string, int start, int end) {
        return string.substring(start, end);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = input.next();

        System.out.print("Enter the Start index (0 <= start < string length): ");
        int start = input.nextInt();

        System.out.print("Enter the End index (start < end <= string length): ");
        int end = input.nextInt();

        if (start < 0 || start >= string.length() || end <= start || end > string.length()) {
            System.out.println("Invalid indices! Please ensure: 0 <= start < end <= string length.");
            input.close();
            return;
        }

        String resultUsingCharAt = createSubstringUsingCharAt(string, start, end);
        String resultUsingBuiltIn = createSubstringUsingBuiltIn(string, start, end);

        if (resultUsingCharAt.equals(resultUsingBuiltIn)) {
            System.out.println("Results from both methods are the same: " + resultUsingCharAt);
        } else {
            System.out.println("Results from both methods are not the same.");
        }

        input.close();
    }
}
