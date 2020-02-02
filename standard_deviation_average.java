import java.lang.Math;
import java.util.Scanner;

public class standard_deviation_average {
	
	public static final double TOTAL_OF_NUMBERS = 3;

	public static void main(String[] args) {
		{
			System.out.print("Input 3 numbers ");
			Scanner inputScanner = new Scanner(System.in);
			
			double firstNum = inputScanner.nextDouble();
			double secondNum = inputScanner.nextDouble();
			double thirdNum = inputScanner.nextDouble();
			
			double Average = 0;
			Average = firstNum + secondNum + thirdNum;
			Average /= TOTAL_OF_NUMBERS;
			
			System.out.println(Average);
			
			double standard_Deviation = 0;
			firstNum -= Average;
			secondNum -= Average;
			thirdNum -= Average;
			
			firstNum = Math.pow(firstNum, 2);
			secondNum = Math.pow(secondNum, 2);
			thirdNum = Math.pow(thirdNum, 2);
			
			standard_Deviation = firstNum + secondNum + thirdNum;
			standard_Deviation = Math.sqrt(standard_Deviation / TOTAL_OF_NUMBERS);
			
			System.out.println(standard_Deviation);

		}
	
	}

}
