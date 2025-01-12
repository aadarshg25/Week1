public class AverageMinMax {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) Math.floor(1000 + Math.random() * 9000);

        }
        return numbers;
    }

    // Method to find average, minimum, and maximum of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0, min = numbers[0], max = numbers[0];
        for (int num : numbers) {
            sum += num;
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        double average = sum / (double) numbers.length;
        return new double[] { average, min, max };
    }

    public static void main(String[] args) {
        int size = 5;
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.print("Generated 4-digit random numbers : ");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Calculate average, min, and max
        double[] result = findAverageMinMax(randomNumbers);

        // Display results
        System.out.println("Average: " + result[0]);
        System.out.println("Minimum: " + (int) result[1]);
        System.out.println("Maximum: " + (int) result[2]);
    }
}
