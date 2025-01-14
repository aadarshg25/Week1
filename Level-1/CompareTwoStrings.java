import java.util.Scanner;

public class CompareTwoStrings {

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

    public static boolean compareUsingEquals(String string1, String string2) {
        return string1.equals(string2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the 1st String : ");
        String string1 = input.next();

        System.out.print("Enter the 2nd String : ");
        String string2 = input.next();

        boolean resultUsingCharAt = compareUsingCharAt(string1, string2);
        boolean resultUsingEquals = compareUsingEquals(string1, string2);

        if (resultUsingCharAt == resultUsingEquals) {
            System.out.println("Result from both are Same.");
        } else {
            System.out.println("Result from both are not Same.");
        }
        input.close();
    }
}