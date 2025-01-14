import java.util.Scanner;

public class GenerateExceptionThree {

    public static String generateIllegalArgumentException(String string) {
        return string.substring(1, 0);
    }

    public static void handleIllegalArgumentException(String string) {
        try {
            generateIllegalArgumentException(string);
        } catch (IllegalArgumentException e) {
            System.out.println("Using Try-Catch we have handled the IllegalArgumentException.");
        } catch (RuntimeException e) {
            System.out.println("Using Try-Catch we have handled a generic RuntimeException.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = input.next();

        try {
            generateIllegalArgumentException(string);
        } catch (Exception e) {
            System.out.println("Exception occurred: IllegalArgumentException.");
        }

        handleIllegalArgumentException(string);

        input.close();
    }
}
