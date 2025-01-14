import java.util.Scanner;

public class GenerateExceptionFive {

    public static String generateArrayIndexOutOfBoundsException(String[] names) {
        return names[names.length];
    }

    public static void handleArrayIndexOutOfBoundsException(String[] names) {
        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Using Try-Catch we have handled the ArrayIndexOutOfBoundsException.");
        } catch (RuntimeException e) {
            System.out.println("Using Try-Catch we have handled a generic RuntimeException.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numberOfNames = input.nextInt();

        String[] names = new String[numberOfNames];

        System.out.println("Enter the names:");
        for (int i = 0; i < numberOfNames; i++) {
            System.out.print("Enter the " + (i + 1) + " name: ");
            names[i] = input.next();
        }

        try {
            generateArrayIndexOutOfBoundsException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred: ArrayIndexOutOfBoundsException. \n" + e);
        }
        System.out.println();
        handleArrayIndexOutOfBoundsException(names);

        input.close();
    }
}
