import java.util.HashMap;
import java.util.Map;

class Menu {
    private Map<Integer, Item> itens;

    public Menu() {
        itens = new HashMap<>();
        itens.put(1, new Item("Chicken Sandwich", 5.35));
        itens.put(2, new Item("Salmon Poke", 10.00));
        itens.put(3, new Item("Spicy Burrito", 7.00));
        itens.put(4, new Item("Pistachio Cookie", 3.00));
        itens.put(5, new Item("Iced Americano", 2.90));
        itens.put(6, new Item("Iced Tea", 1.50));
        itens.put(7, new Item("Protein Shake", 5.00));
    }

    public void showMenu() {
        System.out.println("\n===== MENU =====");
        for (Map.Entry<Integer, Item> entry : itens.entrySet()) {
            System.out.printf("%d - %s ($ %.2f)%n", entry.getKey(), entry.getValue().getName(), entry.getValue().getPrice());
        }
        System.out.println("0 - Finish Order");
    }

    public Item getItem(int num) {
        return itens.get(num);
    }
}
