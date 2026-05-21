import java.util.ArrayList;
import java.util.Scanner;

public class M {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        System.out.println("--- Welcome to BaseCase Shop ---");

        
        System.out.print("How many items do you want to purchase? ");
        int itemCount = input.nextInt();
        input.nextLine();

        if (itemCount > 5) {
            itemCount = 5;
            System.out.println("Maximum item limit is 5. Setting item count to 5.");
        }

        
        for (int i = 1; i <= itemCount; i++) {

            try {
                System.out.print("Enter Product " + i + " Name: ");
                String name = input.nextLine();

                System.out.print("Enter Price: ");
                double price = input.nextDouble();

                System.out.print("Enter Quantity: ");
                int quantity = input.nextInt();
                input.nextLine();

                Order order = new Order(name, price, quantity);

                orders.add(order);

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage() + " Skipping item.");
                input.nextLine();
            }
        }

       
        double subtotal = 0;

        for (Order order : orders) {
            subtotal += order.calculateTotal();
        }

        
        double discountRate;

        if (subtotal > 100) {
            discountRate = 0.20;
        } else if (subtotal > 50) {
            discountRate = 0.10;
        } else {
            discountRate = 0.05;
        }

        double discountAmount = subtotal * discountRate;

       
        double deliveryFee = (subtotal < 50) ? 10 : 0;

        
        double finalTotal = subtotal - discountAmount + deliveryFee;

       
        System.out.println("\n--- Final Receipt ---");

        int index = 1;

        for (Order order : orders) {
            System.out.println("Item " + index + ": " + order);
            index++;
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Applied (" +
                (int)(discountRate * 100) + "%): " + discountAmount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Total: " + finalTotal);

        System.out.println("--------------------------");

        input.close();
    }
}
