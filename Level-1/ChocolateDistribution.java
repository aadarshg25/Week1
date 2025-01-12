import java.util.Scanner;

public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int remainder = number % divisor;
        int quotient = number / divisor;
        return new int[] { remainder, quotient };
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of chocolates : ");
        int numberOfChocolates = input.nextInt();
        System.out.print("Enter number of children : ");
        int numberOfChildren = input.nextInt();

        int[] ans = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

        System.out.println("Each child gets: " + ans[1] + " chocolates");
        System.out.println("Remaining chocolates: " + ans[0]);
    }

}
