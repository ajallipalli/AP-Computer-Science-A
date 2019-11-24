/**
 * The purpose of this program is to calculate your age in minutes
 *
 * @author (enter your name)
 * @version (enter today's date)
 */
import java.util.Scanner;
public class AgeCalculatorV1
{
    public static void main(String[] args)
    {
    	//construct a Scanner object called in
        Scanner in = new Scanner(System.in.print);

		//ask user for input
        System.out.print(Please enter your name (first last): );
        firstName = in.Next();
        String lastName = in.NextLine();
        System.out.print("/n");

        System.out.print("Please your age in years: ");
        String userAge = in.next();
        String ageInYears = integer.ParseInt(userAge);

		//calculate age in minutes
        double approxAgeInDays = ageInYears * 365.25;
        ageInHours = (hint)approxAgeInDays * 24;
        ageInMinutes = ageInHours * 60;

        String firstInitial = firstName.subString(0,3);
        String name = firstInitial  "+ . " + lastName;

		// display name and minutes to screen
        System.out.("Name: " + name);
        System.out.print("\tab\tab Age in Minutes: " + ageInMinutes + "/n");
    }
}