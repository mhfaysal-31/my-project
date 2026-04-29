import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        final double discount_rate = 0.15;
        
     Scanner input = new Scanner(System.in);

     System.out.println("Welcome to the Shop");
     
     System.out.println("Enter Product Name:");
     String ProductName = input.nextLine();

    
     System.out.println("Enter Unit_Price:");
     Double price = input.nextDouble();
     
     System.out.println("Enter quantity:");
     int quantity = input.nextInt();

    double sub_total = price * quantity;

     System.out.println("Item:" + ProductName);

     System.out.println("Subtotal:$"+ sub_total);
    

    double discount = sub_total * discount_rate;
    System.out.println("Discount:$" + discount);

    int final_price = (int)(sub_total - discount);
    System.out.println("Total:$" + final_price);

   }
}
