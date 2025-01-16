import java.util.Scanner;

public class IsAnagram {

        // check if two strings are anagrams
        public static boolean areAnagrams(String str1, String str2) {
                // Check if lengths are different
                if (str1.length() != str2.length()) {
                        return false;
                }

                // for 256 ASCII characters
                int[] charCount = new int[256];

                for (int i = 0; i < str1.length(); i++) {
                        charCount[str1.charAt(i)]++;
                        charCount[str2.charAt(i)]--;
                }

                // Check if all counts are zero
                for (int count : charCount) {
                        if (count != 0) {
                                return false; // Mismatch in character frequencies
                        }
                }

                return true; // Strings are anagrams
        }

        public static void main(String[] args) {
                Scanner input = new Scanner(System.in);

                System.out.print("Enter the first string : ");
                String str1 = input.nextLine();
                System.out.print("Enter the second string : ");
                String str2 = input.nextLine();

                if (areAnagrams(str1, str2)) {
                        System.out.println("The strings are anagrams.");
                } else {
                        System.out.println("The strings are not anagrams.");
                }
        }
}
