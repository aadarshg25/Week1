import java.util.Scanner;

class MeanHeight {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] height = new double[11];
        double totalHeight = 0.0;

        System.out.println("Enter the heights of 11 players ");
        for (int index = 0; index < height.length; index++) {
            System.out.print("Player " + (index + 1) + " height : ");
            height[index] = input.nextDouble();
            totalHeight += height[index];
        }

        double meanHeight = totalHeight / height.length;
        System.out.print("Mean height of the football team : " + meanHeight);

        input.close();
    }
}
