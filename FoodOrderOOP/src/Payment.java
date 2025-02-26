import java.util.Scanner;

public class Payment {
    private static final Scanner scanner = new Scanner(System.in);

    public static double recivePayment(double total) {
        double amountReceived;

        do {
            System.out.print("\nEnter the amount received: $ ");
            amountReceived = scanner.nextDouble();
            if (amountReceived < total) {
                System.out.println("Insufficient value! Add more money!!!");
            }
        } while (amountReceived < total);
        return amountReceived;
    }

    public static void calculateChange(double amountReceived, double total) {
        double change = amountReceived - total;
        System.out.printf("Your change: $ %.2f%n", change);
    }
}
