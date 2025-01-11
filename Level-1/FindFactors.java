import java.util.Scanner;

public class FindFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to find its factors: ");
        int num = input.nextInt();

        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int index = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                if (index == maxFactor) {
                    // Double the size of the array manually
                    maxFactor *= 2;
                    int[] temp = new int[maxFactor];
                    for (int j = 0; j < factors.length; j++) {
                        temp[j] = factors[j];
                    }
                    factors = temp; // here we are changing the reference
                }
                factors[index] = i;
                index++;
            }
        }
        System.out.print("Factors of " + num + " are: ");
        for (int i = 0; i < index; i++) {
            System.out.print(factors[i] + " ");
        }
    }
}
