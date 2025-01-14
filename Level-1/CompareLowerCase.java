import java.util.Scanner;

public class CompareLowerCase {

    public static boolean compareUsingCharAt(String string1, String string2) {
        if (string1.length() != string2.length()) {
            return false;
        }
        for (int i = 0; i < string1.length(); i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static String compareInbuilt(String string) {
        return string.toLowerCase();
    }

    public static String compareUserDefined(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ' ') {
                newString += " ";
            } else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                int newChar = string.charAt(i) + 32;
                newString += (char) newChar;
            } else {
                newString += string.charAt(i);
            }
        }
        return newString;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String string = input.nextLine();

        String resultUserDefined = compareUserDefined(string);
        String resultInbuilt = compareInbuilt(string);

        if (compareUsingCharAt(resultUserDefined, resultInbuilt)) {
            System.out.println("Result from both methods are the same.");
        } else {
            System.out.println("Result from both methods are not the same.");
        }

        input.close();
    }
}
