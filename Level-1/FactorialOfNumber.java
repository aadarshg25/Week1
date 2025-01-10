import java.util.Scanner;
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
		number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a valid positive Number.");
        } else {
            long fact = 1;
            int i = 1;
            while (i <= number) {
                fact *= i;
                i++;
            }

            System.out.println("The factorial of " + number + " is: " + fact);
        }
    }
}
