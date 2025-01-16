//Write an application to prompt a user to enter a range of value that he or she wants to generate
import java.util.Scanner;
import java.util.Random;



public class RandomRangeNumber{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		
		
		
		
		
		System.out.println("Enter upper limit to be generated:");
		int upperlimit = scan.nextInt();
		
		if(upperlimit == 0){
			System.out.println("The number must be greater than 0");
		}
		else{
			int randomNum = rand.nextInt(upperlimit) + 1;
			
			System.out.printf("Generated Random Number from 0 - %d is: %d%n", upperlimit,randomNum);
		}
		
		
		
	}
}