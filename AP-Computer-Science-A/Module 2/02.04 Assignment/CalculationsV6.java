
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Anika Jallipalli (replace with your name)
 * @version 09/11/19       (replace with today's date)
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer variables 
        int iNum1 = 25;
        int iNum2 = 9;  
        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;

        // Addition
        System.out.println("");
        System.out.println("Addition");
        System.out.println("");
        System.out.print(iNum1 + " + " + iNum2 + " = ");
        System.out.println(iNum1 + iNum2);
        System.out.println("");
        System.out.print(dNum1 + " + " + dNum2 + " + " + dNum3+ " = ");
        System.out.println(dNum1 + dNum2 +dNum3);
        //System.out.println();
        
        // Declare integer variables 
        int iNum4 = 11;
        int iNum5 = 9;
        int iNum6 = 25;
        double dNum4 = 3.14;
        double dNum5 = 10.0;
        // Subtraction
        System.out.println("");
        System.out.println("");
        System.out.println("Subtraction");
        System.out.println("");
        System.out.print(iNum4 + " - " + iNum5 + " - " + iNum6 + " = ");
        System.out.println(iNum4 - iNum5 - iNum6); 
        System.out.println("");
        System.out.print(dNum4 + " - " + dNum5 + " = ");
        System.out.println(dNum1 - dNum2);
        //System.out.println();
        
        // Declare integer variables 
        int iNum8 = 25;
        int iNum9 = 9;
        double dNum6 = 3.14;
        double dNum7 = 10.0;
        // Multiplication
        System.out.println("");
        System.out.println("");
        System.out.println("Multiplication");
        System.out.println("");
        System.out.print(iNum8 + " * " + iNum9 + " = ");
        System.out.println(iNum8 * iNum9);
        System.out.println("");
        System.out.print(dNum6 + " * " + dNum7 + " * " + dNum7 + " = ");
        System.out.println(dNum6 * dNum7 * dNum7);
        //System.out.println();
        
        // Declare integer variables 
        int iNum11 = 25;
        int iNum12 = 9;
        double dNum8 = 43.21;
        double dNum9 = 10.0;
        // Division
        System.out.println("");
        System.out.println("");
        System.out.println("Division");
        System.out.println("");
        System.out.print( iNum12 + " / " + iNum11 + " = " );
        System.out.println(iNum12 / iNum11);
        System.out.println("");
        System.out.print(dNum8 + " / " + dNum9 + " = ");
        System.out.println(dNum8 / dNum9);
        //System.out.println();
         
        // Declare integer variables 
        int iNum14 = 11;
        int iNum15 = 9;
        double dNum10 = 10.0;
        double dNum11 = 3.14;
        // Modulus operator
        System.out.println("");
        System.out.println("");
        System.out.println("Modulus");
        System.out.println("");
        System.out.print( iNum14 + " % " + iNum15 + " = " );
        System.out.println(iNum14 % iNum15);
        System.out.println("");
        System.out.print(dNum10 + " % " + dNum11 + " = ");
        System.out.println(dNum10 * dNum11);
        //System.out.println();
        
        // 2.03 Additional int Equations
        System.out.println("");
        System.out.println("");
        int iNuma=77;
        int iNum102=84;
        int iNumf=99;
        int iNum104=34;
        int iNumh=10;
        System.out.println("2.03 Additional int Equations");
        System.out.println("");
        System.out.print(iNuma + " / " + iNumf + " * " + iNum102 + " - " + iNum104 + " = ");
        System.out.println(iNuma / iNumf * iNum102 - iNum104);
        System.out.println("");
        System.out.print(iNumh + " * " + iNum102 + " / " + iNumf + " % " + iNumh + " = ");
        System.out.println(iNumh * iNum102 / iNumf % iNumh);
        System.out.println("");
        System.out.print(iNumh + " + " + iNumf + " - " + iNuma + " % " + iNumh + " = ");
        System.out.println(iNumh + iNumf - iNuma % iNumh);
        
        //2.04 Additional double Equations
        System.out.println("");
        System.out.println("");
        double dNumd=3.7;
        double dNumg=10.11;
        double dNumj=21.21;
        double dNume=113.77;
        double dNumm=101.00007;
        System.out.println("");
        System.out.println("");
        System.out.println("2.04 Additional double Equations");
        System.out.println("");
        System.out.print(dNumd + " + " + dNume + " * " + dNumm + " - " + dNumj + " = ");
        System.out.println(dNumd / dNume * dNumm - dNumj);
        System.out.println("");
        System.out.print(dNume + " / " + dNume + " / " + dNumg + " - " + dNumj + " = ");
        System.out.println(dNume * dNume / dNumg % dNumj);
        System.out.println("");
        System.out.print(dNumm + " * " + dNumd + " - " + dNume + " % " + dNumg + " = ");
        System.out.println(dNumm + dNumd - dNume % dNumg);
        
               
    } // end of main method
} // end of class
