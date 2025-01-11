import java.util.Scanner;

class EligibleToVote {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);
        numberOfStudents = 10;
        int arr[] = new int[numberOfStudents];
        System.out.println("Enter the age of 10 students : ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = input.nextInt();
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] < 0) {
                System.out.println("Invalid age : " + args[index]);
            } else if (arr[index] >= 18) {
                System.out.println("The student with the age " + arr[index] + " can vote");
            } else {
                System.out.println("The student with the age " + arr[index] + " cannot vote");
            }
        }
    }
}