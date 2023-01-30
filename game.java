package Game;

import java.util.Random;
import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		Random r= new Random();
		
		int num = r.nextInt(100);
		
Scanner userInput = new Scanner(System.in);

System.out.println("Enter a number : ");
int number = userInput.nextInt();

if (num == number)
{
	System.out.println("You won");
}else {
	System.out.println("You lost !! \n The generated number is :"+num);
}
	}

}
