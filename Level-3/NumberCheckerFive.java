import java.util.Scanner;

public class NumberCheckerFive {

    public static int[] findFactors(int number) {
        int count = 0;

        // Counting factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Storing factors in the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }

    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum > number;
    }

    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = sumOfFactors(factors) - number;
        return sum < number;
    }

    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }

        return sum == number;
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = input.nextInt();

        // Find factors
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        System.out.println("Greatest factor: " + findGreatestFactor(factors));

        // Find sum of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));

        // Find product of factors
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Find product of cubes of factors
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        // Check if the number is a perfect number
        System.out.println("Is perfect number: " + isPerfectNumber(number));

        // Check if the number is an abundant number
        System.out.println("Is abundant number: " + isAbundantNumber(number));

        // Check if the number is a deficient number
        System.out.println("Is deficient number: " + isDeficientNumber(number));

        // Check if the number is a strong number
        System.out.println("Is strong number: " + isStrongNumber(number));
    }
}
