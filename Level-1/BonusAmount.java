import java.util.Scanner;
public class BonusAmount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salary;
		salary = sc.nextDouble();
        int yearsOfService;
		yearsOfService = sc.nextInt();
        double bonus = 0;
        if (yearsOfService > 5) {
            bonus = salary * 5/100;
        }
        System.out.println("The bonus amount is: " + bonus);
    }
}
