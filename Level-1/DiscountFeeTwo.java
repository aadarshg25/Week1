import java.util.Scanner;

class DiscountFeeTwo {
	public static void main(String[] args) {
		double fee, discountPercent;
		Scanner input = new Scanner(System.in);
		fee = input.nextDouble();
		discountPercent = input.nextDouble();
		double discount = fee * discountPercent / 100;
		double discountedPrice = fee - discount;
		System.out.println(
				"The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice);
		input.close();
	}
}