
/**
 * Calculate BMI of person 
 *
 * @author Anika Jallipalli
 * @version 10/9/2019
 */
import java.util.Scanner;
public class BMI
{
     public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
         //Declare and initialize variables
        double totalWeight;
        boolean isOverweight;

        
         System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        
        System.out.print("Please enter your weight (151.4): ");
        String weight = in.nextLine();
        double totallweight = Double.parseDouble(weight); 
        
        if(totallweight > 7)
        {
            isOverweight = true;
            System.out.println ("Overweight"); 
            
            
            



       
    }
}
}
