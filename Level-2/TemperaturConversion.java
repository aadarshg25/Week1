import java.util.Scanner;

class TemperaturConversion {
	public static void main(String[] args) {
		int celsius;
		Scanner input = new Scanner(System.in);
		celsius = input.nextInt();
		double farenheitResult = (celsius * (9.0 / 5)) + 32;
		System.out.println("The " + celsius + " celsius is " + farenheitResult + " Fahrenheit");
		input.close();

	}
}