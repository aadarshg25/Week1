import java.util.Scanner;

class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a natural number.");
            System.exit(1);
        }

        int[] oddArray = new int[(number / 2) + 1];
        int[] evenArray = new int[(number / 2) + 1];
        int oddIndex = 0, evenIndex = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenArray[evenIndex++] = i;
            } else {
                oddArray[oddIndex++] = i;
            }
        }

        System.out.print("Odd numbers : ");
        for (int index = 0; index < oddIndex; index++) {
            System.out.print(oddArray[index] + " ");
        }
        System.out.println();

        System.out.print("Even numbers : ");
        for (int index = 0; index < evenIndex; index++) {
            System.out.print(evenArray[index] + " ");
        }
        System.out.println();

        input.close();
    }
}
