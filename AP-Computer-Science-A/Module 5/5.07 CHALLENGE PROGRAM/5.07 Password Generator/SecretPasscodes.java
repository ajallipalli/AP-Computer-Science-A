/**
 * The class SecretPasscodes generates random passwords based on four different options.
 *
 * @Anika Jallipalli
 * @10/30/2019
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class SecretPasscodes
{
    public static void main(String[] args) throws IOException
    { 
       int randNum;
       PrintWriter outFile = new PrintWriter(new File("password.txt"));
       Scanner input = new Scanner(System.in);
       System.out.println("      Password Generator Menu        ");
       System.out.println("*************************************");
       System.out.println("*  [1] Lowercase Letters       ");
       System.out.println("*  [2] Uppercase Letters       "); 
       System.out.println("*  [3] Numbers       ");
       System.out.println("*  [4] Mixed Case Letters      ");
       System.out.println("*  [5] Quit!       ");
       System.out.println("*************************************");
       boolean repeat = true;
       while (repeat)
       {
          System.out.println("");
           System.out.println("Enter Selection (1-5): ");
          System.out.println("");
          int selection  = input.nextInt();
          while (selection != 1 && selection != 2 && selection != 3 && selection !=  4 && selection != 5)
         { 
           System.out.println("Invalid option. Please try again."); 
           System.out.println("");
           System.out.println("Enter Selection (1-5): ");
           System.out.println("");
           selection  = input.nextInt();
         }
       //System.out.println(selection);
       if (selection == 5)
            repeat = false;
       else {
              System.out.println("Password Length (6 or more): ");
              int length = input.nextInt();
              while (length < 6)
             { 
              System.out.println("Password length too short. Please try again."); 
              System.out.println("");
              System.out.println("");
              System.out.println("Password Length (6 or more): ");
              length = input.nextInt();
             }
             //System.out.println(length);
             if (selection == 1)
                { //System.out.println("r = " + randNum);
                  //System.out.println("c = " + (char)randNum);
                  
                  for (int loop = 1; loop <= length; loop++)
                  {
                   randNum = (int) (Math.random() * 25) + 97;
                   //System.out.print((char)randNum);
                   outFile.print((char)randNum);
                  }//end of for loop
                  outFile.println();  
                }
             if (selection == 2)
                { //System.out.println("r = " + randNum);
                  //System.out.println("c = " + (char)randNum);
                  
                  for (int loop = 1; loop <= length; loop++)
                  {
                   randNum = (int) (Math.random() * 25) + 65;
                   //System.out.print((char)randNum);
                   outFile.print((char)randNum);
                  }//end of for loop
                  outFile.println();  
                }
             if (selection == 3)
                { //System.out.println("r = " + randNum);
                  //System.out.println("c = " + (char)randNum);
                  
                  for (int loop = 1; loop <= length; loop++)
                  {
                   randNum = (int) (Math.random() * 9) + 48;
                   //System.out.print((char)randNum);
                   outFile.print((char)randNum);
                  }//end of for loop
                  outFile.println();  
                }
             if (selection == 4)
                { //System.out.println("r = " + randNum);
                  //System.out.println("c = " + (char)randNum);
                  
                  for (int loop = 1; loop <= length; loop++)
                  {
                   int randNum2 = (int) (Math.random() * 2);
                   if (randNum2 == 0)
                        randNum = (int) (Math.random() * 25) + 97;
                   else
                        randNum = (int) (Math.random() * 25) + 65;
                   //System.out.print((char)randNum);
                   outFile.print((char)randNum);
                  }//end of for loop
                  outFile.println();  
                }
             }
       }
    outFile.close ( );    //close the file when finished
    System.out.println("Thank you for using the Pass Code Generator!!!");
    System.out.println();
    System.out.println("Here are your randomly generated codes:");
    System.out.println();
    
    //open file
    String token = "";
    File fileName = new File("password.txt");
    Scanner inFile = new Scanner(fileName);
    int count = 1;    
    while( inFile.hasNextLine() )
        {
            token = inFile.nextLine( );      //read next token from file
            System.out.println(count + "    " + token);   //print value of token
            count++;
        }//end while
    }
}