
/**
 * Write a description of class TDEE here.
 *
 * @author Anika Jallipalli
 * @version 10/14/2019
 */
import java.util.Scanner;         //imports Scanner methods
public class TDEE
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name (first last): ");
        String firstName = in.next();
        String lastName = in.nextLine();
        
        System.out.print("Please enter your BMR (1312): ");
        int BMR = in.nextInt();
        
        System.out.print("Please enter your gender(M/F): "); 
        String gender= in.next(); 
        
        System.out.println("Select Your Activity Level");
        System.out.println("[0] Resting (Sleeping, Reclining)");
        System.out.println("[1] Sedentary (Minimal Movement)");
        System.out.println("[2] Light (Sitting, Standing)");
        System.out.println("[3] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[4] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[5] Extremely Active (Full-time Athelete, Heavy Manual Labor)");
        System.out.println();
        System.out.print("Enter the number corresponding to your activity level: ");
        String choice = in.next();
        System.out.println();
        
         //Processing:
        // Activity Factor
        double activityFactor;
        boolean isMale = gender.equalsIgnoreCase("M");
        @SuppressWarnings("unused")
		boolean isFemale = gender.equalsIgnoreCase("F");
        
        // Choice #0
        if (choice.equalsIgnoreCase("0") && isMale) {
        	activityFactor = 1;
        }
        else {
        	activityFactor = 1;
        }
        
        // Choice #1
        if (choice.equalsIgnoreCase("1") && isMale) {
        	activityFactor = 1.3;
        }
        else {
        	activityFactor = 1.3;
        }
        
        // Choice #2
        if (choice.equalsIgnoreCase("2") && isMale) {
        	activityFactor = 1.6;
        }
        else {
        	activityFactor = 1.5;
        }
        
        // Choice #3
        if (choice.equalsIgnoreCase("3") && isMale) {
        	activityFactor = 1.7;
        }
        else {
        	activityFactor = 1.6;
        }
        
        // Choice #4
        if (choice.equalsIgnoreCase("4") && isMale) {
        	activityFactor = 2.1;
        }
        else {
        	activityFactor = 1.9;
        }
        
        // Choice #5
        if (choice.equalsIgnoreCase("5") && isMale) {
        	activityFactor = 2.4;
        }
        else {
        	activityFactor = 2.2;
        }

        // Calculate TDEE
        double tDEE = BMR * activityFactor;

        // Output: Print Results
        System.out.println("Name: " + firstName+ lastName + "\t\tGender: " + gender);
        System.out.println("BMR: " + BMR + " calories "+ "\t\tActivity Factor: " + activityFactor);
        System.out.println("TDEE: " + tDEE + " calories ");
        

}
}
