
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        Scanner scanner = new Scanner(System.in);
        int Principal = 0;
        float monthlyInterest = 0;
        int numberOfPayments = 0;
        while (true) {
            System.out.println("Principal: ");
            Principal = scanner.nextInt();

            if (Principal > 1000 && Principal <= 1000000) {
                break;

            }
            System.out.println("Enetr a valid Principal between 1000 and 100000");

        }

        while (true) {
            System.out.print("Annual Instrest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest >= 1 && annualInterest <= 30) {
                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
                break;

            }
            System.out.println("Enter a Value between 1 and 30");

        }

        while (true) {
            System.out.println("Period (Years): ");
            byte years = scanner.nextByte();
            if (years >= 1 && years <= 30) {
                numberOfPayments = years * MONTHS_IN_YEAR;
                break;

            }
            System.out.println("Enetr valid years between 1 and 30");

        }

        double morgage = Principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) / (Math.pow(1 + monthlyInterest, numberOfPayments));

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(morgage);
        System.out.println("Mortgage: " + mortgageFormatted);

    }
}
