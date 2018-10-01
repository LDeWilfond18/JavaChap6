package Exercises;

import java.util.Scanner;

public class CountByAnything {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userChoice;
		Scanner input = new Scanner(System.in);
		userChoice = input.nextInt();
		
		for(int i = userChoice; i <= (userChoice * 100); i = i + userChoice) {
			System.out.print("" + i);
			if(i % (userChoice * 10) == 0) {
				System.out.println();
			}
		}
	}

}
