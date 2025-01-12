import java.util.Scanner;

public class NumberCheckerThree {

    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;
        if (number == 0) {
            return 1;
        }
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    public static int[] DigitsArray(int number) {
        number = Math.abs(number);
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int number) {
        int[] digits = DigitsArray(number);
        int[] reversedDigits = reverseArray(digits);
        return compareArrays(digits, reversedDigits);
    }

    // duck number
    public static boolean isDuckNumber(int number) {

        if (number == 0) {
            return false;
        }
        if (number % 10 == 0) {
            return true;
        }
        number = Math.abs(number);
        boolean leadingNonZeroFound = false;

        while (number > 0) {
            int digit = number % 10;
            if (digit == 0 && leadingNonZeroFound) {
                return true;
            }
            if (digit != 0) { // we have encountered on non-zero
                leadingNonZeroFound = true; // now an upcomming zero is valid
            }
            number /= 10;
        }
        return false;
    }

    public static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = input.nextInt();

        System.out.println("Count of digits in " + number + ": " + countDigits(number));

        int[] digits = DigitsArray(number);
        System.out.print("Digits array of : ");
        printArray(digits);

        int[] reversed = reverseArray(digits);
        System.out.print("Reversed digits array: ");
        printArray(reversed);

        // Compare two arrays
        boolean arraysEqual = compareArrays(digits, reversed);
        System.out.println("Are digits array and reversed array equal? " + arraysEqual);

        // Check if the number is a palindrome
        boolean palindrome = isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + palindrome);

        // Check if the number is a duck number
        System.out.println("Is " + number + " a duck number? " + isDuckNumber(number));
    }
}
