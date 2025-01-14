public class GenerateException {

    public static char generateNullPointerException(String string) {
        return string.charAt(0);
    }

    public static void handleNullPointerException(String string) {
        try {
            generateNullPointerException(string);
        } catch (NullPointerException e) {
            System.out.println("Using Try-Catch we have handled the RuntimeException \n" + e);
        }
    }

    public static void main(String[] args) {
        String string = null;

        // Directly generating the exception
        try {
            generateNullPointerException(string);
        } catch (NullPointerException e) {
            System.out.println(
                    "Exception occurred while calling generateNullPointerException function \n" + e);
        }
        System.out.println();
        // Refactored to handle the exception
        handleNullPointerException(string);
    }
}
