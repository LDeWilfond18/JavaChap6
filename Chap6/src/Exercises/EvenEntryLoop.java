package Exercises;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numChoice = 0;
		Scanner input = new Scanner(System.in);
		while(numChoice != 999){
		System.out.println("Pick an even number");
		numChoice = input.nextInt();
		if(numChoice % 2 == 0) {
			System.out.print("Good job! ");
		}
		else
			System.out.println("ERROR!");
		}
	}

}
