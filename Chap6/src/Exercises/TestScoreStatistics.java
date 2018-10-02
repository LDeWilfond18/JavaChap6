package Exercises;

import java.util.Scanner;

public class TestScoreStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int high = 0;
		int low = 100;
		int average = 0;
		int count = 0;
		int userChoice=0;
		int total = 0;
		int userExit = 0;
		
		while(userExit != 999) {
			System.out.print("Enter the scores");
			userChoice = input.nextInt();
		if(userChoice >= high && userChoice < 101) {
			high = userChoice;
			count = count + 1;
		}
		else if(userChoice <= low) {
			low = userChoice;
			count = count + 1;
		}
		else if(userChoice <= 101 && userChoice >= 0) {
			count = count + 1;
		}
		else if(userChoice > 100 || userChoice < 0) {
			System.out.println("Out of range. ");
		}
		total = userChoice + total;
		average = total / count;
		System.out.println("Enter a number to continue to exit 999");
		userExit = input.nextInt();
		}
		
		System.out.println("There were " + count + " scores entered, the average was " + average
				+ " The highest score was " + high + " the lowest score was " + low + " ");
	}

}
