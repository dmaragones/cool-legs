import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors_game {
	public static final int MAX_GAMES = 5;
	public static final int ROCK = 1;
	public static final int PAPER = 2;
	public static final int SCISSORS = 3;
	public static final int MAX_NUMBER = 3;

	public static void main(String[] args) {
		
		int playerChoice = -1;
		
	    Random  generator = new Random();
		int computerChoice = generator.nextInt(MAX_NUMBER+1);
		
		int game_number;
		   
		for (game_number = 0; (game_number < MAX_GAMES) && 
				(playerChoice != computerChoice); game_number++ )
		{

			

		}
			

	}

}
