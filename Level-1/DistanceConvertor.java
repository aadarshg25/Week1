import java.util.Scanner;

class DistanceConvertor {
	public static void main(String[] args) {
		double distanceInFeet, yards, miles, remainingYards;
		Scanner input = new Scanner(System.in);
		distanceInFeet = input.nextDouble();
		yards = distanceInFeet / 3;
		miles = yards / 1760;
		remainingYards = yards % 1760;
		System.out.println(
				"Distance of " + distanceInFeet + " feet  is " + miles + " miles and " + remainingYards + " yards");
		input.close();
	}
}