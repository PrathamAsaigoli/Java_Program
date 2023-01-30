package Game;

import java.util.Random;
import java.util.Scanner;



public class GameL2 {

	public static void main(String[] args) {

		Random r = new Random();
		int num = r.nextInt(10);
System.out.println(num);
		Scanner userInput = new Scanner(System.in);

		System.out.println("Enter a number : ");
		 int number = userInput.nextInt();
		
		
       while(true)
       {  
		if (num == number)
		{
			System.out.println("You won");
			break;
		} 
		else
		{
		
			if(number>num) 
			{
				System.out.println("Too large");
				System.out.println("Retry : ");
				number = userInput.nextInt();
			}
				else
				{
				System.out.println("Too small");
				System.out.println("Retry : ");
				number = userInput.nextInt();
				
			}
		}
	}
	}

}

