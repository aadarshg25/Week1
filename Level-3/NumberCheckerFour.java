
import java.util.Scanner;

public class NumberCheckerFour {

    // prime number
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    // spy number
    public static boolean isSpy(int number) {
        int sumOfDigits = 0;
        int productOfDigits = 1;
        while (number > 0) {
            int digit = number % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            number /= 10;
        }
        return sumOfDigits == productOfDigits;
    }

    // automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;

        while (number > 0) { // whole number should appear at last of the square
            if (square % 10 != number % 10) {
                return false;
            }
            square /= 10;
            number /= 10;
        }

        return true;
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        if (number % 7 == 0 || number % 10 == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = input.nextInt();

        System.out.println("Is " + number + " a prime number  " + isPrime(number));
        System.out.println("Is " + number + " a neon number  " + isNeon(number));
        System.out.println("Is " + number + " a spy number  " + isSpy(number));
        System.out.println("Is " + number + " an automorphic number  " + isAutomorphic(number));
        System.out.println("Is " + number + " a buzz number  " + isBuzz(number));
    }
}