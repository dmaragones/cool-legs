import java.util.Scanner;

public class multiples {
	
	public static void main(String[] args) {
		
		System.out.print("Enter a positive integer greater than 0. ");
		Scanner input = new Scanner( System.in );
		int positiveInteger = input.nextInt();
		
		System.out.print("Enter the limit. ");
		int limit = input.nextInt();
		
		if ((positiveInteger > 0) && (limit > 0))
		{
			System.out.print("The  multiples of " + positiveInteger + " "
					+ "(up to " + limit + ") are: ");
			int multiples;
		
			for (multiples = 0; multiples <= limit;
					multiples = multiples + positiveInteger)
			{
				if (multiples < limit)
					System.out.print(((multiples > 0)?", ":"") + multiples);
			}
		}
		

	}

}