/**
 * The class AnimalPopulation uses the Monte Carlo sampling method to 
 * estimate the average number of animals observed before spotting one 
 * you are tracking within a particular ecosystem.
 *
 * @Ipshita Bhatnagar
 * @11/14/2018
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class AnimalPopulation
{
    public static void main(String [] args) throws IOException
    { 
        System.out.println("");
        System.out.println("Welcome to the Fox Squirrel Simulator");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        //opening a file to storage data
        PrintWriter outFile = new PrintWriter(new File("animalPopulation.txt"));
        
        int trial = 0;
        double sum = 0;
        // get number of trials which is at least 1000
        while (trial < 1000)
        {
            System.out.println("How many trials do you want simulated?");
            System.out.println("Please enter a number larger than 1000");
            System.out.println("");
            trial = input.nextInt();
            if (trial < 1000) 
            System.out.println("Please try again. Enter a number greater than 1000.");
            System.out.println("");
        }
        //System.out.println(trial);
        
        //assigning a number to animal
        int animal = 8;
        for(int counter = 0; counter < trial; counter++)   
        {
           int randAnimal = (int) (Math.random() * 9) + 1;
           int count = 1;
           while (randAnimal != animal)
           {
            randAnimal = (int) (Math.random() * 9) + 1;
            count++;
           }
           outFile.println(count);
        }
        outFile.close ( ); //closing file
        
        //opening file for processing
        File fileName = new File("animalPopulation.txt");
        Scanner inFile = new Scanner(fileName);
        int token = 0;
        String tokenString;
        //calculating sum
        while( inFile.hasNextLine() )
        {
            tokenString = inFile.nextLine( );
            token = Integer.parseInt(tokenString);
            sum = sum + token;
        }//end while
       System.out.println("simulating trials now... one moment please...");
         System.out.println("");
        double avg = sum/trial;
        //System.out.println("sum =" + sum);
        //System.out.println("t =" + trial);
        System.out.println("The results!");
          System.out.println("");
        System.out.println("The average number of squirrels observed "); 
        System.out.println("until spotting a Fox Squirrel at the city park is: " + avg); 
          System.out.println("");
        inFile.close();                 //close input file

    }
    
}
    