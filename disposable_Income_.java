/*  SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 10: 5
       Comment: I assume that the assignment asks for 35% tax on the user gross income no matter what. 
       
   2. Did I use easy-to-understand, meaningful CONSTANT names?
       Mark out of 5: 5
       Comment: 0.35 equivalent to 35%
       
    3. Did I format the CONSTANT names properly (in UPPERCASE)?
       Mark out of 5: 5
       Comment: TAX_PERCENTAGE is all capitals.
       
   4. Did I use easy-to-understand meaningful variable names?
       Mark out of 10: 5
       Comment: Others resolve to use Gross/Net Income for naming, but I use Before and After
       for even more simplicity. Unsure if better.
       
   5. Did I format the variable names properly (in lowerCamelCase)?
       Mark out of 10: 8
       Comment: For all variables consisting of two words, I made the second one start with a capital
       letter.
       
   6. Did I indent the code appropriately?
       Mark out of 10: 7
       Comment: I indented similarly to all previous assignments.
       
   7. Did I read the input correctly from the user using appropriate question(s)?
       Mark out of 10: 7
       Comment: I tried slightly different wordings than the example given. "Before tax" at the start of the 
       sentence may prevent less users from overlooking it than if it was at the end...??????
       
   8. Did I compute the disposable income correctly?
       Mark out of 10: 4
       Comment: I used three lines to do this. It could possibly be done in less, but I am unsure whether 
       that would be more efficient or pleasant. (e.g. Multiplying gross income by 0.65, using brackets)
       
   9. Did I compute the disposable income percentage correctly?
       Mark out of 10: 9
       Comment: Did not quite achieve the example answer of 8%, even with rounding.
       
   10. Did I output the correct answer in the correct format (as shown in the examples)?
       Mark out of 10: 6
       Comment: The extra line of "Given a monthly pay of..." was another way for me to 
       check the variables after computing.
       
   11. How well did I complete this self-assessment?
       Comment: 7
       Comment: Used lots of resources to find out how to make 7.5% -> 8%, like trying formatting (the sample
       answers were in .00) or rounding functions but it seems inconsequential :((((((((((( 
   Total Mark out of 100 (Add all the previous marks):  
*/

import java.util.Scanner;
import java.lang.Math;
public class disposable_Income_ {

	public static final double TAX_PERCENTAGE = 0.35;
	public static void main(String[] args) {
		
		Scanner inputScanner = new Scanner( System.in );
		System.out.print("Before tax, what is your monthly pay? ");
		double beforePay = inputScanner.nextDouble();
		
		System.out.print("What is your monthly travel cost? ");
		double travel = inputScanner.nextDouble();
		
		System.out.print("What is your monthly rent? ");
		double rent = inputScanner.nextDouble();
		
		System.out.print("What is your monthly spend on food? ");
		double food = inputScanner.nextDouble();
		
		double tax = beforePay * TAX_PERCENTAGE;
		double afterPay = beforePay - tax;
		double disposable_Income = afterPay - food - rent - travel;
		
		double percentage_Salary = (disposable_Income / beforePay) * 100;
		
		inputScanner.close();

		System.out.println("Given a monthly pay of " + beforePay + 
				" and living costs of " + travel 
				+  ", " + rent + " and " + food + "...");
		
		System.out.println("Your disposable income is " + 
		        disposable_Income + " which is " + 
				(Math.round(percentage_Salary)) + "% of your monthly pay." );
		
	}
	
}
