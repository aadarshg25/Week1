import java.util.Scanner;

class IsFirstSmallest {
    public static void main(String[] args) {
        int number1, number2, number3;
        boolean isSmallest;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        number1 = input.nextInt();

        System.out.print("Enter the second number : ");
        number2 = input.nextInt();

        System.out.print("Enter the third number ");
        number3 = input.nextInt();
        if (number1 < number2 && number1 < number3) {
            isSmallest = true;
        } else {
            isSmallest = false;
        }

        System.out.println("Is the first number the smallest? " + isSmallest);

        input.close();
    }
}
