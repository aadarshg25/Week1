import java.util.Scanner;

public class IsPalindrome {

	// check Palindrome or Not
	public static boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
				return false;
			}

		}
		return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the String : ");
		String string = input.nextLine();

		if (isPalindrome(string)) {
			System.out.println("Given String is a Palindrome");
		} else {
			System.out.println("Given String is not a Palindrome");
		}

	}
}