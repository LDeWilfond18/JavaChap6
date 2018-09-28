package practice;

import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userResponse;
		int cInt;
		String result = null;
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		
		Scanner input = new Scanner(System.in);
		do {
		cInt = (int )(Math.random() * 3 + 1);
		
		System.out.println("Rock - 1, Paper - 2 or Scissors - 3?");
		userResponse = input.nextInt();
		
		
		if (cInt == 1) {
			if(userResponse == 1) {
				result = "Tie ";
				count2 = count2 + 1;
			}
			else if(userResponse == 2) {
				result = "I win ";
				count = count + 1;
			}
			else {
				result = "You Lose ";
				count1 = count1 + 1;
			}
		}
		if (cInt == 2) {
			if(userResponse == 2) {
				result = "Tie ";
				count2 = count2 + 1;
			}
			else if(userResponse == 3) {
				result = "I win ";
				count = count + 1;
		}
			else {
				result = "You Lose ";
			count1 = count1 + 1;
		}
		}
		if (cInt == 3) {
			if(userResponse == 3) {
				result = "Tie ";
				count2 = count2 + 1;
		}
			else if(userResponse == 1) {
				result = "I win ";
				count = count + 1;
		}
			else {
				result = "You Lose ";
			count1 = count1 + 1;
		}
		}
		displayMessage(result, count, count2, count1);
		} while(count < 20 && count2 < 20 && count1 < 20);
		
	}
	public static void displayMessage(String result, int count, int count2, int count1) {
		System.out.println(result + "You won " + count + " Times, you tied " + count2 + " Times and lost " + count1 + "times");
	}
}











