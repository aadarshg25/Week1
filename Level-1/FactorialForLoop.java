import java.util.Scanner;
public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Please enter a valid positive Number.");
			} else {
            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
			}
			
            System.out.println("The factorial of " + number + " is: " + fact);
		}
	}
}
