/**
 * The purpose of this program is to accurately and efficiently caluclate your body mass index (BMI).
 * 
 * @author Anika Jallipalli
 * @version 10/8/2019
 */
import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        //Initialize and declare variables
        String target = "";
        Scanner in = new Scanner(System.in);
        double BMI;
        double kilograms;
        double meters;
        double height;
        //Print program function/description
       
        //Prompt user for input
        System.out.print("Enter your name (first last)  : ");
        String firstName = in.next(); 
        String lastName = in.nextLine();
        System.out.println("");
        System.out.print("Weight in pounds (e.g. 175): ");
        String weight = in.next();
        System.out.println("");
        System.out.print("Enter your height in feet and inches (e.g. 5 11): ");
        String feet = in.next(); 
        String inches = in.nextLine();
        System.out.println("");
        //Parse Strings
        double feet1   = Double.parseDouble(feet);
        double inches1 = Double.parseDouble(inches); 
        double weight1 = Double.parseDouble(weight);
        //Unit Conversions
        height= ((feet1*12)+inches1);
        kilograms= (weight1 * .45);
        meters= (height * .025);  
        
         //Calculate BMI
        BMI = (kilograms/(meters*meters));
        //Determine if if normal weight, overweight, or underweight
        if(BMI < 18.5)
            target = "Underweight.";
        else if(BMI < 24.9)
            target = "Normal.";
        else if (BMI < 29.9)
            target = "Overweight.";
        else if (BMI > 29.9)
            target = "Obese.";
            
            
        
        System.out.println("Body Mass Index Calculator");
        System.out.println("");
        System.out.println("=======================================================");
        System.out.println("");
        System.out.print("Name: ");
        System.out.print(firstName + lastName);
        System.out.println("");
        System.out.print("Height (m): ");
        System.out.print(meters);
        System.out.println("");
        System.out.print("Weight (kg): ");
        System.out.print(kilograms);
        System.out.println("");
        System.out.print("BMI: ");
        System.out.print(BMI);
        System.out.println("");
        System.out.print("Category: ");
        System.out.print(target);
        
        
    } //end main
}//end class 

       