import java.util.Scanner;

public class CompareCharArray {

    public static char[] userDefined(String string) {
        char[] charArray = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charArray[i] = string.charAt(i);
        }
        return charArray;
    }

    public static char[] inBuilt(String string) {
        return string.toCharArray();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = input.next();

        char[] resultUser = userDefined(string);
        char[] resultInBuilt = inBuilt(string);

        if (resultUser.length != resultInBuilt.length) {
            System.out.println("Results are not Same.");
            input.close();
            return;
        }
        for (int i = 0; i < resultInBuilt.length; i++) {
            if (resultInBuilt[i] != resultUser[i]) {
                System.out.println("Results are not Same.");
                input.close();
                return;
            }
        }
        System.out.println("Results are Same.");
        input.close();
    }
}
