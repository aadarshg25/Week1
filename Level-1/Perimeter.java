import java.util.Scanner;

class Perimeter {
	public static void main(String[] args) {
		double side, perimeterOfSquare;
		Scanner input = new Scanner(System.in);
		perimeterOfSquare = input.nextDouble();
		side = perimeterOfSquare / 4;
		System.out.println("The length of the side is " + side + " whose perimeter is " + perimeterOfSquare);
		input.close();

	}
}