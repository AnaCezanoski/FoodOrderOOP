import java.util.ArrayList;
import java.util.List;

class Order {
    private List<Item> itens;
    private static final double taxes = 0.10;

    public Order() {
        this.itens = new ArrayList<>();
    }

    public void addItem(Item item) {
        if (item != null) {
            itens.add(item);
            System.out.println(item.getName() + " added to the order!");
        } else {
            System.out.println("Invalid item!");
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getPrice();
        }
        return total;
    }

    public double calculateTaxes() {
        return calculateTotal() * taxes;
    }

    public void displayInvoice(String customerName) {
        System.out.println("\n ===== INVOICE =====");
        System.out.println("Customer: " + customerName);
        for (Item item : itens) {
            System.out.println("- " + item.getName() + " $ " + String.format("%.2f", item.getPrice()));
        }

        double orderTotal = calculateTotal();
        double orderTaxes = calculateTaxes();
        double total = orderTotal + orderTaxes;

        System.out.printf("Order Total: $ %.2f%n", orderTotal);
        System.out.printf("Taxes (10%%): $ %.2f%n", orderTaxes);
        System.out.printf("Total to Pay: $ %.2f%n", total);
    }

    public double getTotalWithTaxes() {
        return calculateTotal() + calculateTaxes();
    }
}
