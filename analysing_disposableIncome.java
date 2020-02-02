/* SELF ASSESSMENT
   1. Did I use easy-to-understand meaningful variable and CONSTANT names? 
       Mark out of 10: 5
       Comment: muchMoreAverage also is used in case disposable_Income = 0. I did not make another variable
       for that specific instance.
   2. Did I format the variable and CONSTANT names properly (in lowerCamelCase and UPPERCASE_WITH_UNDERSCORES)?
       Mark out of 10: 10
   3. Did I indent the code appropriately?
       Mark out of 10: 7
   4. Did I read the input correctly from the user using appropriate questions?
       Mark out of 15: 12
   5. Did I computer the disposable income and disposable income percentage correctly, and output it in the correct format?
       Mark out of 15: 12
       Comment: I used the Round function again to copy the given example.
  6. Did I use an appropriate series of if statements to generate the income analysis to the user?
       Mark out of 25: 14
   7. Did I provide the correct output for each possibility in an easy to read format?
       Mark out of 10: 10
   8. How well did I complete this self-assessment?
       Mark out of 5: 4
   Total Mark out of 100 (Add all the previous marks):
       74
*/

import java.util.Scanner;
import java.lang.Math;
public class analysing_disposableIncome {

	public static final double TAX_PERCENTAGE = 0.35;
	public static final double MUCH_MORE_AVERAGE = 750;
	public static final double MUCH_LESS_AVERAGE = 250;
	public static final double AVERAGE = 500;
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
		
		boolean income_lessthan = (disposable_Income < AVERAGE );
		if (income_lessthan) {
			boolean income_muchless = (disposable_Income < MUCH_LESS_AVERAGE );
			if (disposable_Income <= 0)
				System.out.print("You have NO disposable income...");
			else if (income_muchless)
				System.out.print("You have much less than the average disposable per month. ");
			else System.out.print("You have less than the average disposable per month. ");	
		}
		else 
		{
			boolean income_muchmore = (disposable_Income >=  MUCH_MORE_AVERAGE);
			if (disposable_Income == AVERAGE)
				System.out.print("You have the exact average disposable monthly. ");
			else if (income_muchmore)
				System.out.print("You have much more than the average disposable per month. ");
			else System.out.print("You have more than the average disposable per month. ");	
		}

		
	}
	
}
