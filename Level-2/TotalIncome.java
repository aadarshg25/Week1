import java.util.Scanner;

class TotalIncome {
	public static void main(String[] args) {
		int salary, bonus;
		Scanner input = new Scanner(System.in);
		salary = input.nextInt();
		bonus = input.nextInt();
		int totalIncome = salary + bonus;
		System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR "
				+ totalIncome);
		input.close();

	}
}