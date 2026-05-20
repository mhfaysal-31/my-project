public class FT {

    public static void main(String[] args) {

        System.out.println("--- Order Test ---");

        try {

            Order order1 = new Order("Gaming Mouse", 25.75, 3);
            Order order2 = new Order("Mechanical Keyboard", 120.0, 1);

            System.out.println(order1);
            System.out.println(order2);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Invalid Order Attempt ---");

        try {

            Order invalidOrder = new Order("Monitor", -50, 1);

            System.out.println(invalidOrder);

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}
