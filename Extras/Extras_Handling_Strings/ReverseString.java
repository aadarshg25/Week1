import java.util.Scanner;

public class ReverseString {

	public static String reverseOfString(String str) {

		String reversedString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reversedString += str.charAt(i);
		}

		return reversedString;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String string = input.nextLine();

		System.out.println("Reversed String is : " + reverseOfString(string));
	}
}