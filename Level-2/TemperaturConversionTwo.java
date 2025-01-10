import java.util.Scanner;

class TemperaturConversionTwo {
	public static void main(String[] args) {
		int fahrenheit;
		Scanner input = new Scanner(System.in);
		fahrenheit = input.nextInt();
		double celsiusResult = (fahrenheit - 32) * (5.0 / 9);
		System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");
		input.close();

	}
}