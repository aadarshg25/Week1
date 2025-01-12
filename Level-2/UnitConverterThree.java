import java.util.Scanner;

public class UnitConverterThree {

    // Temperature conversions
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Mass conversions
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Temperature (In fahrenheit) : ");
        int fahrenheit = input.nextInt();
        System.out.print("Enter the Temperature (In celsius) : ");
        int celsius = input.nextInt();
        System.out.print("Enter the Weight (In pounds) : ");
        int pounds = input.nextInt();
        System.out.print("Enter the Weight (In kilograms) : ");
        int kilo = input.nextInt();
        System.out.print("Enter the Volume (In gallons) : ");
        int gallons = input.nextInt();
        System.out.print("Enter the Volume (In liters) : ");
        int liters = input.nextInt();

        System.out.println(fahrenheit + " Fahrenheit = " + convertFahrenheitToCelsius(fahrenheit) + " Celsius");
        System.out.println(celsius + " Celsius = " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilo + " kilograms = " + convertKilogramsToPounds(kilo) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
