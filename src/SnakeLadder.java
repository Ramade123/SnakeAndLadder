import java.util.Random;
import java.util.Scanner;


public class SnakeLadder
{
	public int Noplay = 0;
	public int Ladder = 1;
	public int Snake = 2;
	
	public void StartGame()
	{
		Random random = new Random();
		var sc=new Scanner (System.in);
		int Position = 0;
		int dice;
		int option;
		int numofDiceRoll = 0;
		
		while (Position <= 100)
		{
			System.out.println("Player now at position: "+ Position);
			dice = random.nextInt(1, 7);
			numofDiceRoll++;
			System.out.println("\n\nNumber appeared in dice is:" + dice);
			option = random.nextInt(0,3);
			
			if (option == Ladder)
			{
				if ((Position += dice) > 100)
				{
					Position = 100;
					System.out.println("Player moves to 100th position");
				}
				else
				{
					Position += dice;
				}
			}
			else if (option == Snake)
			{
				if (Position < dice)
				{
					Position = 0;
				}
				else
				{
					Position -= dice;
				}
			}
			else {
				Position=Position;
			}
		
		System.out.println("Player reaches at: " + Position);
		System.out.println("The number of times dice was played: " + numofDiceRoll);
		
		}


	}
}



