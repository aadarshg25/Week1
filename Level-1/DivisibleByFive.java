import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
        int number;
        boolean isDivisible;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number : ");
        number = input.nextInt();

        if (number % 5 == 0) {
            isDivisible = true;
        } else {
            isDivisible = false;
        }

        System.out.println("Is the number " + number + " divisible by 5 ? " + isDivisible);

        input.close();
    }
}
