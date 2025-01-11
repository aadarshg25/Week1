import java.util.Scanner;

class SumWithLimit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.print("Enter numbers (maximum 10 values). Enter 0 or a negative number to stop : ");

        while (true) {
            double num = input.nextDouble();

            // Break if the user enters 0, a negative number, or if the array is full
            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        // Sum Calculation
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        System.out.println("The entered numbers are:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        System.out.println("The total sum of the numbers is " + total);

        input.close();
    }
}
