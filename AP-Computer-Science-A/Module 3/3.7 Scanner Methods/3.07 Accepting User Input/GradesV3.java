/**
 * The purpose of the program is to calculate the grade point 
 * average of a student 
 * 
 * @author Anika Jallipalli
 * @version 09/15/2019
 */
import java.util.Scanner;         //imports Scanner methods
public class GradesV3
{
    public static void main(String [ ] args)
    {
       //construct a Scanner object with one line
        Scanner in = new Scanner(System.in);

        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        //Students Name
        System.out.print("Enter your full name (not including middle name) with spaces: ");
        String word1 = in.next();
        String word2 = in.next();
          /*
           * Scanner in;
           * in = new Scanner(System.in);
           * System.out.print("Please enter an integer value: ");
           * int intValue = in.nextInt();
             */

        //Scanner in;
        System.out.print("");
        System.out.print("Subject Name (with spaces if multiple words): ");
        String word3 = in.next();
        String word4 = in.next();
        System.out.print("");
        numTests = 0;       //counts number of tests
        testGrade = 0;     //individual test grade
        totalPoints = 0;   //total points for all tests
        average = 0.0;  //average grade
        
        System.out.print("Please Enter an integer value of test  grade: ");
        int intValue0 = in.nextInt();
        System.out.print("");
      
        

        
        System.out.print("Test grade entered is :"+ intValue0);
        testGrade = intValue0;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        System.out.print("Please Enter an integer value of test  grade: ");
        int intValue1 = in.nextInt();
        System.out.print("");
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue1);
        System.out.print("");
        testGrade = intValue1;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        
        System.out.print("Please Enter an integer value of test  grade: ");
        int intValue2 = in.nextInt();
        System.out.print("");
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue2);
        System.out.print("");
        testGrade = intValue2;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        System.out.print("");
        
                System.out.print("Subject Name (with spaces if multiple words): ");
        String word5 = in.next();
        String word6 = in.next();
        System.out.print("");
        System.out.print("");
        numTests = 0;       //counts number of tests
        testGrade = 0;     //individual test grade
        totalPoints = 0;   //total points for all tests
        average = 0.0;  //average grade
        
        
        System.out.print("Please Enter an integer value of test  grade: ");
        int intValue3 = in.nextInt();
        System.out.print("");
      
        

        
        System.out.print("Test grade entered is :"+ intValue3);
        testGrade = intValue3;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        System.out.print("Please Enter an integer value of test  grade: ");
        int intValue4 = in.nextInt();
        System.out.print("");
        System.out.print("");
        

        
        System.out.print("Test grade entered is :"+ intValue4);
        System.out.print("");
        testGrade = intValue4;
       
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        
        System.out.print("Please Enter an integer value of test  grade: ");
        System.out.print("");
        int intValue5 = in.nextInt();
        
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue5);
        System.out.print("");
        testGrade = intValue5;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        
        
                System.out.print("Subject Name (with spaces if multiple words): ");
                System.out.print("");
        String word7 = in.next();
        String word9 = in.next();
        System.out.print("");
        numTests = 0;       //counts number of tests
        testGrade = 0;     //individual test grade
        totalPoints = 0;   //total points for all tests
        average = 0.0;  //average grade
         
        
        System.out.print("Please Enter an integer value of test  grade: ");
        System.out.print("");
        int intValue6 = in.nextInt();
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue6);
        System.out.print("");
        testGrade = intValue6;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        
        System.out.print("Please Enter an integer value of test  grade: ");
        System.out.print("");
        int intValue7 = in.nextInt();
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue7);
        System.out.print("");
        testGrade = intValue7;
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        System.out.print("");
        
        System.out.print("Please Enter an integer value of test  grade: ");
        System.out.print("");
        int intValue8 = in.nextInt();
      
        

        System.out.print("");
        System.out.print("Test grade entered is :"+ intValue8);
        System.out.print("");
        testGrade = intValue8;
       
        numTests++;
        totalPoints+= testGrade; 
        average= (double)totalPoints / numTests; 
        System.out.println("");
        System.out.print(" Test #  " + numTests);
        System.out.print(" Test Grade: " + testGrade);
        System.out.print(" Total Points: " + totalPoints);
        System.out.println(" Average Score: " + average);
        
        
        
    

        }//end of main method
}//end of class
        
        
        
        
        
        
               
        