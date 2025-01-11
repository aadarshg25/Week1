import java.util.Scanner;

public class BMICalculate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Step 1: Take input for the number of persons
        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();

        // Step 2: Create 1D arrays to store height, weight, BMI, and status for each
        // person
        double[] height = new double[numberOfPersons];
        double[] weight = new double[numberOfPersons];
        double[] bmi = new double[numberOfPersons];
        String[] weightStatus = new String[numberOfPersons];

        // Step 3: Take input for the weight and height of each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.print("Enter height (in meters) for person " + (i + 1) + ": ");
            height[i] = input.nextDouble();
            while (height[i] <= 0) { // Validate height input
                System.out.print("Height must be positive. Enter height again: ");
                height[i] = input.nextDouble();
            }

            System.out.print("Enter weight (in kg) for person " + (i + 1) + ": ");
            weight[i] = input.nextDouble();
            while (weight[i] <= 0) { // Validate weight input
                System.out.print("Weight must be positive. Enter weight again: ");
                weight[i] = input.nextDouble();
            }

            // Step 4: Calculate BMI for each person and store it in the bmi array
            bmi[i] = weight[i] / (height[i] * height[i]);

            // Step 5: Determine weight status
            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] < 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obesity";
            }
        }

        // Step 6: Display the height, weight, BMI, and weight status for each person
        System.out.println("\nHeight(m)  Weight(kg)  BMI    Status");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println(height[i] + "    " + weight[i] + "    " + bmi[i] + "    " + weightStatus[i]);
        }

        input.close();
    }
}
