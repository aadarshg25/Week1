import java.util.Scanner;

class QuotientRemainder {

    // Method to find the remainder and quotient
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number1 : ");
        int number1 = input.nextInt();

        System.out.print("Enter the number2 : ");
        int number2 = input.nextInt();

        // Validate divisor to avoid division by zero
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero ");
            return;
        }

        // Find the quotient and remainder
        int[] result = findRemainderAndQuotient(number1, number2);

        System.out.println("Quotient: " + result[1]);
        System.out.println("Remainder: " + result[0]);
    }

}
