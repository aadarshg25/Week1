import java.util.Scanner;
class Division{
	public static void main(String [] args){
		int number1 , number2 ,quotient ,reminder;
		Scanner input = new Scanner(System.in);
		number1 = input.nextInt();
		number2 = input.nextInt();
		quotient = number1 / number2;
		reminder = number1 % number2;
		System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number " + number1 +" and " + number2);
		input.close();
		
		
	}
}