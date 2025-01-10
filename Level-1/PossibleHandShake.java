import java.util.Scanner;

class PossibleHandShake {
	public static void main(String[] args) {
		int numberOfStudents, numberOfHandShake;
		Scanner input = new Scanner(System.in);
		numberOfStudents = input.nextInt();
		numberOfHandShake = (numberOfStudents * (numberOfStudents - 1)) / 2;
		System.out.println("Total number of Possible HandShakes is " + numberOfHandShake + " for " + numberOfStudents
				+ " students");
		input.close();

	}
}