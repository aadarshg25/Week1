import java.util.Scanner;

class AreaOfTriangle {
	public static void main(String[] args) {
		double base, height, areaOfTriangleInCm, areaOfTriangleInInches;
		System.out.println("Give the input in cm");
		Scanner input = new Scanner(System.in);
		base = input.nextDouble();
		height = input.nextDouble();
		areaOfTriangleInCm = (1.0 / 2.0) * base * height;
		areaOfTriangleInInches = areaOfTriangleInCm / 6.4516;
		System.out.println(
				"Area of Triangle in cm is " + areaOfTriangleInCm + " and in inches " + areaOfTriangleInInches);
		input.close();
	}
}