import java.util.Scanner;

public class UserDefinedLength {

    public static int userDefLen(String string) {
        string = string.trim();
        int count = 0;
        while (true) {
            try {
                string.charAt(count); // till last char count
                count++;
            } catch (StringIndexOutOfBoundsException e) {
                return count;
            }

        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the sentence : ");
        String string = input.nextLine();

        int resultLen = userDefLen(string);
        System.out.println("Length of String : " + resultLen);

    }
}