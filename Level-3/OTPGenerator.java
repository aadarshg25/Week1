public class OTPGenerator {
  
    public static int generateOTP() {
        // Generate a 6-digit number between 100000 and 999999
        return (int) (Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otpArray) {
        for (int i = 0; i < otpArray.length; i++) {
            for (int j = i + 1; j < otpArray.length; j++) {
                if (otpArray[i] == otpArray[j]) {
                    return false; // Duplicate OTP found
                }
            }
        }
        return true; 
    }

    public static void main(String[] args) {
        int[] otpArray = new int[10];

        // Generate OTPs 10 times
        for (int i = 0; i < 10; i++) {
            otpArray[i] = generateOTP();
            System.out.println("Generated OTP " + (i + 1) + ": " + otpArray[i]);
        }

        if (areOTPsUnique(otpArray)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Some OTPs are duplicates!");
        }
    }
}
