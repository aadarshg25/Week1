import java.util.Scanner;

class LargestNumber {
    public static void main(String[] args) {
        boolean isFirstLargest, isSecondLargest, isThirdLargest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number :  ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        int number2 = input.nextInt();

        System.out.print("Enter the third number : ");
        int number3 = input.nextInt();

        if (number1 > number2 && number1 > number3) {
            isFirstLargest = true;
        } else {
            isFirstLargest = false;
        }
        if (number2 > number1 && number2 > number3) {
            isSecondLargest = true;
        } else {
            isSecondLargest = false;
        }
        if (number3 > number1 && number3 > number2) {
            isThirdLargest = true;
        } else {
            isThirdLargest = false;
        }

        System.out.println("Is the first number the largest ? " + isFirstLargest);

        System.out.println("Is the second number the largest ? " + isSecondLargest);

        System.out.println("Is the third number the largest ? " + isThirdLargest);

        input.close();
    }
}
