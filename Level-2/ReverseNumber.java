import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive number.");
            return;
        }

        int temp = number;
        int count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }
        int[] digits = new int[count];

        int index = 0;
        while (number != 0) {
            digits[index++] = number % 10;
            number /= 10;
        }

        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();

        input.close();
    }
}