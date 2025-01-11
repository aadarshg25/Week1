import java.util.Scanner;

class MultiToOneDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of rows ");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns ");
        int columns = input.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the elements of the matrix ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Enter element at position (" + i + "," + j + ") ");
                matrix[i][j] = input.nextInt();
            }
        }

        int[] array = new int[rows * columns];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[index++] = matrix[i][j];
            }
        }

        System.out.println("The original 2D array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The 1D array is:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        input.close();
    }
}
