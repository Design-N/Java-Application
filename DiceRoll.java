import java.security.SecureRandom;

public class DiceRoll{
	public static void main (String args []){
		SecureRandom randNum = new SecureRandom();
		
		int dieRoll = randNum.nextInt(6) + 1;
		
		System.out.printf("You rolled a: %d ", + dieRoll);
		
	}
}