import java.util.Scanner;

public class CompareTwoStrings {

    public static String compareStrings(String str1, String str2) {
        // Get the length of the shorter string
        int length = Math.min(str1.length(), str2.length());

        // Compare the strings character by character
        for (int i = 0; i < length; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // If characters are different, return the result based on their ASCII values
            if (char1 < char2) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (char1 > char2) {
                return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
            }
        }

        // If the loop completes, strings are identical up to the length of the shorter
        // string
        // Now check the lengths
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (str1.length() > str2.length()) {
            return "\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order";
        } else {
            return "\"" + str1 + "\" and \"" + str2 + "\" are identical";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String string1 = input.nextLine();
        System.out.print("Enter the Second String : ");
        String string2 = input.nextLine();

        String result = compareStrings(string1, string2);
        System.out.println(result);
    }
}
