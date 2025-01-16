import java.util.Scanner;

public class TrimSpaces {

    // UserDefined Method
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Loop till the first non-space character (leading spaces)
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Loop till the last non-space character (trailing spaces)
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // UserDefined Method
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i <= end; i++) {
            result += str.charAt(i);
        }

        return result;
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a Sentence : ");
        String inputString = input.nextLine();

        int[] indices = trimSpaces(inputString);
        String trimmedStringUserDefined = createSubstring(inputString, indices[0], indices[1]);

        String trimmedStringBuiltIn = inputString.trim();

        boolean isEqual = compareStrings(trimmedStringUserDefined, trimmedStringBuiltIn);

        System.out.println("Trimmed string (User Defined): '" + trimmedStringUserDefined + "'");
        System.out.println("Trimmed string (built-in): '" + trimmedStringBuiltIn + "'");
        System.out.println("Are both trimmed strings equal? " + isEqual);

        input.close();
    }
}
