import java.util.Scanner;

class HeightConvertor {
	public static void main(String[] args) {
		double heightInCm, heightInInches;
		int feet, feetInInches;
		Scanner input = new Scanner(System.in);
		heightInCm = input.nextDouble();
		heightInInches = heightInCm / 2.54;
		feet = (int) heightInInches / 12;
		feetInInches = (int) heightInInches % 12;

		System.out.println(
				"Your Height in cm is " + heightInCm + " while in feet is " + feet + " and inches is " + feetInInches);
		input.close();
	}
}