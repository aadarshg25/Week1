import java.util.Scanner;

public class GenerateExceptionTwo {

    public static char generateStringIndexOutOfBoundsException(String string) {
        return string.charAt(string.length());
    }

    public static void handleStringIndexOutOfBoundsException(String string) {
        try {
            generateStringIndexOutOfBoundsException(string);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(
                    "Using Try-Catch we have handled the StringIndexOutOfBoundsException. \n" + e);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String string = input.next();

        // Directly generating the exception
        try {
            generateStringIndexOutOfBoundsException(string);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred while calling generateStringIndexOutOfBoundsException Function.  \n"
                    + e);
        }

        // Calling the method to handle the exception
        handleStringIndexOutOfBoundsException(string);

        input.close();
    }
}
