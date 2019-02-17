/*
 neeraj tony
 id:1234083
 hw 7
 * */

import java.util.Scanner;
public class Error 
{ 
  	public static void main(String args[]){ 
		//Variable declaration
		int yourChoice, computerChoice; 
		String yourInput; 

		//Welcome screen and show the basic rule to the user
		System.out.println("Welcome to Paper, Scissor and Rock");
		System.out.println("Let me remind you the rule first:\nScissor cuts paper, paper covers rock, and rock breaks scissors. ");
		System.out.println("0: Rock\n1: Paper\n2: Scissor");
		int count=0;
		do{
		//Get your choice
		Scanner scan=new Scanner(System.in);
		System.out.println("Now tell me your choice!");
		yourChoice = scan.nextInt();

		//Get computer choice
		computerChoice = (int)(Math.random()*10); //generate a random number
		int a=computerChoice %= 3; 
		

		//Compare your Choice with computer’s choice and output the result
		//Case I: Both you and computer pick the same choice, then it’s a tie!+

	
			try{
				if((yourChoice<0) || (yourChoice>2)){
					throw new Exception("error");
					}
				else{
					System.out.println("computer choice: "+ a);
						if (yourChoice == a){
								System.out.println("It is a tie!"); 
							}

						//Case II: You WIN :)

						if (yourChoice >a){
							if((yourChoice==2) && (a==0)){
								System.out.println("you lose!"); 
								}
							else{
								System.out.println("you win!"); 
								}
							}

						//Case III: You lose :(

						if (yourChoice <a){
							if((yourChoice==0) && (a==2)){
								System.out.println("you win!"); 
								}
							else	
								System.out.println("you lose!"); 
							}
						count=0;
					}
				}
			catch (Exception e){
				System.out.println("enter a valid choice");
				count=1;
				}
			}while(count==1);

	}
}

