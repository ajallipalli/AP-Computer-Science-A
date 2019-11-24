
/**
 * Write a description of class BuyingVegetables here.
 * Shopper should be able to list type of vegetable and price per a pound and get a digital reciept 
 * 
 * @author Anika Jallipalli
 * @version 9/28/2019
 */
import java.util.Scanner;     
public class BuyingVegetables
{
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("");
        System.out.println("Hello! Thank you for shopping at SmartShopper!");
        System.out.println("");
        System.out.println("Please print first and last name:");
        String word1= in.next();
        String word2= in.next();
        System.out.println("Please print date (mm/dd/yyyy): ");
        String word4= in.next();
        System.out.println("Please print order name (First only): ");
        String word10 = in.next();
        System.out.println("Name of item purchasing: " ); 
        String word3= in.next();
        System.out.println("Price per a pound of item purchasing: "); 
        double doubleValue1 = in.nextDouble();
        System.out.println("Amount of pounds of item purchasing: ");
        int intValue1 = in.nextInt();
        System.out.println("Enter debit card number (###-###-###): ");
        String word5= in.next();
        System.out.println("Enter pin number (####): ");
        String word6= in.next();
        
        
        System.out.println("*_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_*");
        System.out.println("*_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_* *_*");
        System.out.println("");
        System.out.println("Your e-Receipt");
        System.out.println("Order Name: " + word10);
        System.out.print( word1 );
        System.out.println(word2);
        System.out.println("Date Purchased: " + word4);
        System.out.println("Account Number: ###-###-" +word5.substring(8,11));
        System.out.println("Item Name:" + word3);
        System.out.println("Item Price per pound: " + doubleValue1);
        System.out.println("Amount of pounds of item purchased: " + intValue1);
        System.out.println("");
        System.out.println("Amount charged to account: "+ (doubleValue1*intValue1));
        System.out.println("Thank you! Have a great day!");
       
        
        
        
     
        
       
        
        

    }
}
