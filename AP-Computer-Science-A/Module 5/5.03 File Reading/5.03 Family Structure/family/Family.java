/**
 * Reads text in from a file and calculates the probability of family combinations
 * from the given data.
 * 
 * @author Anika Jallipalli
 * @version 10/20/2019
 */

import java.util.Scanner; 
import java.io.File; 
import java.io.FileReader; 
import java.io.IOException; 
public class Family 
{
    public static void main(String[] args) throws IOException {
        //initialize variables
		int bothBoys = 0;
		int bothGirls = 0;
		int boyAndGirl = 0;
		int sampleSize = 0;
		int counter=0; 
		double probabilityOfBothBoy=0;
		double probabilityOfBoyAndGirl = 0;
		double probabilityOfBothGirl =0; 
		String token = ""; 
		Scanner inFile = new Scanner(new File("maleFemaleInFamily.txt"));
		
		while(inFile.hasNext()){
			token = inFile.next();
 
				if(token.equals("BB")){
					bothBoys++;
					counter++;
				}else if(token.equals("GG")){
					bothGirls++;
					counter++;
				}else if(token.equals("BG")){
					boyAndGirl++;
					counter++;
				}else if(token.equals("GB")){
				    boyAndGirl++;
				    counter++;	
				}  
				 
		}
		sampleSize = counter;
	        inFile.close();
	        probabilityOfBothBoy = (double)bothBoys / (double)sampleSize; 
		probabilityOfBothGirl = (double)bothGirls / (double)sampleSize; 
		probabilityOfBoyAndGirl = (double)boyAndGirl / (double)sampleSize; 
		System.out.println("");
		System.out.println("Compostion statistics for families with two children.");
		System.out.println("");
		System.out.println("Total number of families: " + sampleSize);
		System.out.println("");
		System.out.println("Number of families with");
		System.out.print("          2 boys: "+ bothBoys);
		System.out.println("        represents "+ probabilityOfBothBoy + " %");
		System.out.print("         2 girls: "+ bothGirls);
	        System.out.println("        represents "+ probabilityOfBothGirl + " %"); 
		System.out.print("1 boy and 1 girl: "+ boyAndGirl);
		System.out.println("        represents "+ probabilityOfBoyAndGirl + " %");

}
}