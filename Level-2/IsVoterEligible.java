import java.util.Scanner;

public class IsVoterEligible {

    // Method to generate random ages for students
    public static int[] generateAges(int numberOfStudents) {
        int[] ages = new int[numberOfStudents];

        // Generate random ages between 18 and 99
        for (int i = 0; i < numberOfStudents; i++) {
            ages[i] = 18 + (int) (Math.random() * 82);
        }

        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            String status = "Cannot Vote";

            // Validate age and set status
            if (age >= 18) {
                status = "Can Vote";
            } else if (age < 0) {
                status = "Invalid Age";
            }

            result[i][0] = String.valueOf(age);
            result[i][1] = status;
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayTable(String[][] array) {
        System.out.println("Age | Voting Status");
        System.out.println("-------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][0] + " | " + array[i][1]);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        int[] ages = generateAges(numberOfStudents);

        String[][] votingStatus = checkVotingEligibility(ages);

        displayTable(votingStatus);

        input.close();
    }
}
