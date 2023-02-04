package project;

import java.util.Random;
import java.util.Scanner;

public class Rock_paper_scissoror {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner userInput = new Scanner(System.in);
	boolean decision = true;
	
	while(decision) {
		Random r = new Random();
		int num = r.nextInt(3);
		//System.out.println(num);
		System.out.println("\nEnter any of the following : ");
		System.out.println("0.Rock\n1.Paper\n2.Scissor\n");
		int n = userInput.nextInt();
		
		if(num==n) {
			    System.out.println("The Game is a Draw \n");
			    if(num==0){
					System.out.println("Computer selects Rock\n");
				}
				else
				if(num==1) {
					System.out.println("Computer selects Paper\n");
				}
				
				else {
					System.out.println("Computer selects Scissor\n");
				}
					
			}
		
		else {
			    switch(n)
					{
							
					    case 0: if(num==0){
							System.out.println("Computer selects Rock\n");
						}
						else
						if(num==1) {
							System.out.println("Computer selects Paper\n");
						}
						
						else {
							System.out.println("Computer selects Scissor\n");
						}
						
					    		if((n==0 && num==2) || (n==2 && num==0)){
									System.out.println("USER WINS\n");
								}
								else {
									System.out.println("USER LOOSES");
								}
								break;
							
					    case 1: if(num==0){
							System.out.println("Computer selects Rock\n");
						}
						else
						if(num==1) {
							System.out.println("Computer selects Paper\n");
						}
						
						else {
							System.out.println("Computer selects Scissor\n");
						}
						
					    		if((n==1 && num==0) || (n==0 && num==1)){
									System.out.println("USER WINS\n");
								}
								else {
									System.out.println("USER LOOSES\n");
								}
								break;	
								
					    case 2: if(num==0){
							System.out.println("Computer selects Rock\n");
						}
						else
						if(num==1) {
							System.out.println("Computer selects Paper\n");
						}
						
						else {
							System.out.println("Computer selects Scissor\n");
						}
						
					    		if((n==2 && num==1) || (n==1 && num==2)){
									System.out.println("USER WINS\n");
								}
								else {
									System.out.println("USER LOOSES\n");
								}
								break;
						default:System.out.println("ENTER CORRECTLY");	
							
					}
			   }
		 	System.out.println("Enter true to continue and false to discontinue");
		    decision = userInput.nextBoolean();
		}
		
	}

}
