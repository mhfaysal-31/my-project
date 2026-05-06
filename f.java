import java.util.Scanner;

public class f {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("--- Welcome to BaseCase Shop ---");

        System.out.print("How many items do you want to purchase? ");
        int n = input.nextInt();

        if (n > 5) {
            n = 5;
        }

        input.nextLine(); 

        String[] names = new String[n];
        double[] prices = new double[n];
        int[] qty = new int[n];

        double subtotal = 0;

        
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Product " + (i + 1) + " Name: ");
            names[i] = input.nextLine();

            System.out.print("Enter Price: ");
            prices[i] = input.nextDouble();

            System.out.print("Enter Quantity: ");
            qty[i] = input.nextInt();
            input.nextLine();

            
            if (prices[i] <= 0 || qty[i] <= 0) {
                System.out.println("Invalid input! Try again.");
                i--;
                continue;
            }

            subtotal += prices[i] * qty[i];
        }

        
        double discount;
        if (subtotal > 100) {
            discount = subtotal * 0.20;
        } else if (subtotal > 50) {
            discount = subtotal * 0.10;
        } else {
            discount = subtotal * 0.05;
        }

        
        double deliveryFee = (subtotal < 50) ? 10 : 0;

        double finalTotal = subtotal - discount + deliveryFee;

        
        System.out.println("*****");
        System.out.println("--- Final Receipt ---");

        for (int i = 0; i < n; i++) {
            double total = prices[i] * qty[i];

            System.out.println("Item " + (i + 1) + ": " + names[i] +
                    " - " + qty[i] + " x " + prices[i] + " = " + total);
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Delivery Fee: " + deliveryFee);
        System.out.println("Final Total: " + finalTotal);
        System.out.println("--------------------------");
    }
}
