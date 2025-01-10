import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
		number = sc.nextInt();
        if (number < 1) {
            System.out.println("Please enter a valid positive natural number.");
			} else {
            int Sum = (number * (number + 1)) / 2;
            int loopSum = 0;
            int i = 1;
            while (i <= number) {
                loopSum += i;
                i++;
			}
            if (Sum == loopSum) {
                System.out.println("Both results are correct and result is : " +Sum);
				} else {
                System.out.println("The results do not match.");
			}
		}
	}
}
