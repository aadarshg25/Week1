import java.util.Scanner;
class DoubleOpt{
	public static void main(String [] args){
		double a , b , c , result1 , result2 , result3 ;
		Scanner input = new Scanner(System.in);
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();
		result1 = a + b *c;
		result2 = a * b + c;
		result3 = c + a / b;
		System.out.println("The results of Int Operations are "+result1 + " "+result2+" and "+result3);
		input.close();
		
	}
}