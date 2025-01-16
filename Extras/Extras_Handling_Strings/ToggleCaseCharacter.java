import java.util.Scanner;

public class ToggleCaseCharacter {

    // Method to toggle characters
    public static String toggleCase(String str) {
        String toggledStr = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isUpperCase(ch)) {
                // If character is uppercase, convert it to lowercase
                toggledStr += Character.toLowerCase(ch);
            } else if (Character.isLowerCase(ch)) {
                // If character is lowercase, convert it to uppercase
                toggledStr += Character.toUpperCase(ch);
            } else {
                // For non-alphabetic characters, append as it is
                toggledStr += ch;
            }
        }

        return toggledStr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();
        String result = toggleCase(str);

        System.out.println("Original: " + str + " Toggled: " + result);
        input.close();
    }
}
