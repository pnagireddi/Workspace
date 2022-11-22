package demo;

public class Umpire {
	static int numberFromGueseer;
	static int numberFromPlayer1;
	static int numberFromPlayer2; 

	public void recivingNumberFromGuesser() {
		Guesser guesser = new Guesser();
		int givingNumberTOUmpire = guesser.GivingNumberTOUmpire();
		numberFromGueseer = givingNumberTOUmpire;
	}

	public void recivingNumberFromPlayer1() {
		Player1 player1 = new Player1();
		int NumberTOUmpire = player1.guessingTheNumber();
		numberFromPlayer1 = NumberTOUmpire;
	}

	public void recivingNumberFromPlayer2() {
		Player2 player2 = new Player2();
		int NumberTOUmpire = player2.guessingTheNumber();
		numberFromPlayer2 = NumberTOUmpire;
	}

	public void compare() {
		if (numberFromPlayer1 == numberFromPlayer2) {

			if ((numberFromGueseer != numberFromPlayer1) && (numberFromGueseer != numberFromPlayer2)) 
			{
				System.out.println("....Number is :" + numberFromGueseer);
				System.out.println("All players are ...Faild to guess the correct number");
				System.out.println("........GAME OVER......");
				System.out.println(">> THANKYOU AND BETTER LUCK NEXT TIME <<");

			}
			else {
			System.out.println("Game is Tie...!");
			System.out.println("Let's guess one more Time ... All the Best for all..");
			Player1 player11 = new Player1();
			numberFromPlayer1 = player11.guessingTheNumber();
			Player2 player22 = new Player2();
			numberFromPlayer2 = player22.guessingTheNumber();
			Umpire umpire1 = new Umpire();
			umpire1.compare();
			}
		} 

		else if (numberFromGueseer == numberFromPlayer1) {
			System.out.println(" The Winner is Player one...Congratulations palyer one..");
			System.out.println("........GAME OVER......");
			System.out.println(">> THANKYOU ... VISIT AGAIN <<");

		} 
		else if (numberFromGueseer == numberFromPlayer2) {
			System.out.println(" The Winner is Player Two...Congratulations palyer Two..");
			System.out.println("........GAME OVER......");
			System.out.println(">> THANKYOU ... VISIT AGAIN <<");

		}

		else {
			System.out.println("Both are faild...! To Guess the Correct number ");
			System.out.println(" The new game ...Will begen Soon... All the Best....");
			Umpire umpire2 = new Umpire();
			umpire2.recivingNumberFromGuesser();
			umpire2.recivingNumberFromPlayer1();
			umpire2.recivingNumberFromPlayer2();
			umpire2.compare();

		}
	}
}
