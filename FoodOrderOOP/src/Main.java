import java.awt.*;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Order");
            System.out.println("2. Exit");
            System.out.print("Choose an Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            if (option == 2) {
                System.out.println("Closing the program...");
                break;
            } else if (option == 1) {
                processOrder();
            } else {
                System.out.println("Invalid option. Try again!!!.");
            }
        }
    }

    public static void processOrder() {
        System.out.print("\nEnter your name: ");
        String customerName = scanner.nextLine();

        Menu menu = new Menu();
        Order order = new Order();

        menu.showMenu();

        while (true) {
            System.out.print("\nChoose an item by number: ");
            int choice = scanner.nextInt();

            if (choice == 0) break;
            order.addItem(menu.getItem(choice));
        }

        order.displayInvoice(customerName);
        double total = order.getTotalWithTaxes();

        double amountRecived = Payment.recivePayment(total);
        Payment.calculateChange(amountRecived, total);

        System.out.println("\nOrder completed! Thank you!!!");
    }
}
