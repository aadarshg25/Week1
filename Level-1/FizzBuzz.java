import java.util.Scanner;

class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
            System.exit(1);
        }

        String[] fizzBuzz = new String[number];

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                fizzBuzz[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                fizzBuzz[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                fizzBuzz[i - 1] = "Buzz";
            } else {
                fizzBuzz[i - 1] = String.valueOf(i);
            }
        }

        System.out.println("FizzBuzz Array : ");
        for (int i = 0; i < fizzBuzz.length; i++) {
            System.out.println("Position " + (i + 1) + " = " + fizzBuzz[i]);
        }

        input.close();
    }
}
