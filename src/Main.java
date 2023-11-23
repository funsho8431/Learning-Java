import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Coding a Mortgage Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal: ");
        int principal = scanner.nextInt();
        System.out.println("Rate: ");
        float rate = scanner.nextFloat();
        float toPercentage = rate / 100;
        float monthlyInterestRate = toPercentage / 12;
        System.out.println("Period (Years): ");
        int years = scanner.nextInt();
        float totalNumberOfPayments = 12 * years;
        System.out.println("Mortgage");

        float top = (float) (monthlyInterestRate * Math.pow((1 + monthlyInterestRate), (totalNumberOfPayments)));
        float bottom = (float) Math.pow((1 + monthlyInterestRate), (totalNumberOfPayments)) -1;

        float mortgage = principal * (top / bottom);
        // The first version of the mortgage calculator done

        System.out.println(mortgage);

    }
}