package Exercises;

import java.util.Scanner;

public class RandomGuess3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess;
		int computerSecret;
		int quit;
		int count = 0;
		String result = null;
		
		computerSecret = (int )(Math.random() * 10 +1);
		
		Scanner input = new Scanner(System.in);
		do {
		System.out.println("Pick a number Any number as long as it is no higher then 10 ");
		userGuess = input.nextInt();
		
		if(userGuess < computerSecret) {
			System.out.println("The number is higher ");
			
		}
		else if(userGuess > computerSecret) {
			System.out.println("The number is lower ");
	
		}
		else if(userGuess == computerSecret) {
			result = "You Win ";
		}
		count = count + 1;
	
	System.out.println("Do you want to quit? 1 for yes, 2 for no");
	quit = input.nextInt();
		}while(1 != quit || userGuess != computerSecret);
		System.out.println(result + "It took you " + count + " tries");
	}
	public static void displayMessage(String result, int count) {
		
	}

}
