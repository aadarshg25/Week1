import java.lang.Math;
import java.util.Scanner;

class NumberOfRounds {
	public static void main(String[] args) {
		int side1, side2, side3, numberOfRounds, roundDistance;
		int totalDistanceInKm = 5;
		int totalDistanceInM = 5 * 1000;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Sides of Triangle in meters");
		side1 = input.nextInt();
		side2 = input.nextInt();
		side3 = input.nextInt();
		roundDistance = side1 + side2 + side3;
		numberOfRounds = (int) Math.ceil(totalDistanceInM / (roundDistance));

		System.out
				.println("The total number of rounds the athlete will run is " + numberOfRounds + " to complete 5 km");
		input.close();

	}
}