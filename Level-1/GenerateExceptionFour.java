import java.util.Scanner;

public class GenerateExceptionFour {

    public static int generateNumberFormatException(String string) {
        return Integer.parseInt(string);
    }

    public static void handleNumberFormatException(String string) {
        try {
            generateNumberFormatException(string);
        } catch (NumberFormatException e) {
            System.out.println("Using Try-Catch we have handled the NumberFormatException.");
        } catch (RuntimeException e) {
            System.out.println("Using Try-Catch we have handled a generic RuntimeException.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = input.next();

        // Directly generating the exception
        try {
            generateNumberFormatException(string);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred: NumberFormatException. \n" + e);
        }
        System.out.println();

        // Handling the exception using a separate method
        handleNumberFormatException(string);

        input.close();
    }
}
