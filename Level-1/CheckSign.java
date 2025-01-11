import java.util.Scanner;

public class CheckSign {
    public static void main(String[] args) {
        int numOfInput = 5;
        int arr[] = new int[numOfInput];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter five Integers : ");
        for (int index = 0; index < arr.length; index++) {
            arr[index] = input.nextInt();
        }
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] > 0) {
                if (arr[index] % 2 == 0) {
                    System.out.println(arr[index] + " is Postive and a Even Number.");
                } else {
                    System.out.println(arr[index] + " is Postive and a Odd Number.");
                }
            } else if (arr[index] == 0) {
                System.out.println(arr[index] + " is Zero.");
            } else {
                System.out.println(arr[index] + " is a Negative Number.");
            }
        }
        if (arr[0] > arr[arr.length - 1]) {
            System.out.println("First is greater than last.");
        } else if (arr[0] == arr[arr.length - 1]) {
            System.out.println("First is equal to last.");
        } else {
            System.out.println("First is less than last.");
        }
    }
}
