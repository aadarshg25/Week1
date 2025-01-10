import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        double weightInPounds, weightInKilo;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        weightInPounds = input.nextDouble();

        weightInKilo = weightInPounds / 2.2;

        System.out.println("The weight of the person in pounds is " + weightInPounds +
                " and in kg is " + weightInKilo);

        input.close();
    }
}
