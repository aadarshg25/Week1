import java.util.Scanner;

public class MostFrequentCharacter {

    public static char MostFrequentChar(String str) {
        int[] freqArray = new int[256];

        for (char c : str.toCharArray()) {
            freqArray[c]++;
        }

        // Find the character with the maximum frequency
        char mostFrequentChar = str.charAt(0);
        int maxCount = 0;

        for (int i = 0; i < 256; i++) {
            if (freqArray[i] > maxCount) {
                maxCount = freqArray[i];
                mostFrequentChar = (char) i;
            }
        }

        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str = input.nextLine();
        char result = MostFrequentChar(str);
        System.out.println("The most frequent character is: " + result);
    }
}
