package dice;
import java.util.Scanner;
import java.util.Random;

public class Diceroll {

	public static void main(String[] args) {
		//dice rolling app
		System.out.println("Hello, welcome to the dice roller app!");
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.print("Roll the dice? (y/n): ");
		//string input 
		String choice = scanner.nextLine();
		
		//start while loop
		while(choice.equalsIgnoreCase("y")) 
		{ 
		//for loop
			//int total = 0;
			//int totalrolls = 2;
			//for(int i = 0; i < totalrolls; i++) this was my solution in c# but it doesn't seem to work here 
			//{
			//int roll = random.nextInt(1,7);	
			//System.out.println("Roll: " + roll);
			//total += roll;
			//}
			int firstRoll = random.nextInt(1,7);
			int secondRoll = random.nextInt(1,7);
			int total = firstRoll + secondRoll;
			System.out.println("Roll 1: " + firstRoll);
			System.out.println("Roll 2: " + secondRoll);
			if(total == 2) 
			{
				System.out.println("Snake eyes!");
			}
			else if(total == 12) 
			{
				System.out.println("Boxcars!");
			}
			else 
			{
				System.out.println("Total: " + total);
			}
			System.out.print("Would you like to roll again? (y/n): ");
			choice = scanner.nextLine();
		}
	}

}
