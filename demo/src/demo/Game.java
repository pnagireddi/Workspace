package demo;

public class Game {

	public static void main(String[] args) {
		Umpire umpire=new Umpire();
		umpire.recivingNumberFromGuesser();
		umpire.recivingNumberFromPlayer1();
		umpire.recivingNumberFromPlayer2();
		umpire.compare();
	}

}
