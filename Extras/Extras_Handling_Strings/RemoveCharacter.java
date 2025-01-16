import java.util.Scanner;

public class RemoveCharacter {

    // remove all occurrences of a specific character
    public static String removeCharacter(String str, char charToRemove) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // If the current character is not the character to remove, add it to the result
            if (ch != charToRemove) {
                result += ch;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = input.nextLine();

        System.out.print("Enter the character to remove:");
        char charToRemove = input.next().charAt(0);

        String modifiedString = removeCharacter(str, charToRemove);
        System.out.println("Modified String: " + modifiedString);
    }
}
