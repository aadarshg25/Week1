import java.util.Scanner;

class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number ");
        long number = input.nextLong();

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            digits[index] = (int) number % 10;
            number /= 10;
            index++;
            if (index == maxDigit) {
                break;
            }
        }

        int largest = -1, secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("The largest digit is: " + largest);
        if (secondLargest == -1) {
            System.out.println("There is no second largest digit");
        } else {
            System.out.println("The second largest digit is: " + secondLargest);
        }

        input.close();
    }
}
