import java.text.DecimalFormat;
import java.util.Scanner; // Importing package
/**
 * 
 * @author Jawahar G  
 * Version 1.0       2018-03-05 computing for the entered 2 pair of values with error term. 
 *
 */

public class W9D2SimpleProgram {
	
	public static void main(String args []) {
		System.out.println("Program designed by Jawahar");
		System.out.println("");
		System.out.println("");
		Scanner keyboard = new Scanner(System.in);        // Initialized scanner class
		System.out.println("Enter the 1 st measured value");
		double Measured1 = keyboard.nextDouble();           // reading first measured value from input.
		System.out.println("Enter the 1 st Error value");
		double Error1 = keyboard.nextDouble();              // reading first Error value from input.
		System.out.println("Enter the 2 nd measured value");
		double Measured2 = keyboard.nextDouble();           // reading second measured value.
		System.out.println("Enter the 2 nd Error value");
		double Error2 = keyboard.nextDouble();              // reading second error value.
		System.out.println("");
		System.out.println("");
		
		DecimalFormat format = new DecimalFormat();
		
		// code for addition
		System.out.println(" Addition");
		double MeasuredSum = Measured1 + Measured2;         // performing addition of the terms.  
		double ErrorSum = Error1 + Error2;                  // performing addition of error term.
		System.out.println(MeasuredSum +"±" + ErrorSum);    
		System.out.print("After rounding off the term:");
		System.out.println(MeasuredSum+"±" + format.format(ErrorSum));// displaying the addition with round off
		System.out.println("");
		// code for Subtraction
		System.out.println(" Subtraction ");
		double MeasuredSub = Measured1 - Measured2;          //performing subtraction of the terms.
		double ErrorSub = Error1 + Error2;                   // performing subtraction of error term.
		System.out.println(MeasuredSub +"±" + ErrorSub);
		System.out.print("After rounding off the term:");
		System.out.println(MeasuredSub +"±" + format.format(ErrorSub));     // displaying the subtraction with rouning off
		keyboard.close();                                     // closing the key board
		
	}

	
	

}
