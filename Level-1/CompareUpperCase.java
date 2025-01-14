import java.util.Scanner;

public class CompareUpperCase {

    public static String compareUserDefined(String string) {
        String newString = "";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if (currentChar == ' ') {
                newString += " ";
            } else if (currentChar >= 'a' && currentChar <= 'z') {
                newString += (char) (currentChar - 32); // Clowercase to uppercase
            } else {
                newString += currentChar;
            }
        }
        return newString;
    }

    public static String compareInbuilt(String string) {
        return string.toUpperCase();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String (In LowerCase): ");
        String string = input.nextLine();

        String resultUserDefined = compareUserDefined(string);
        String resultInBuilt = compareInbuilt(string);

        if (resultUserDefined.equals(resultInBuilt)) {
            System.out.println("Result from both methods are the same.");
        } else {
            System.out.println("Result from both methods are not the same.");
        }
        input.close();
    }
}
