package Exercises;

import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		Scanner input = new Scanner(System.in);
		int ans1;
		int ans2;
		int ans3;
		String result;
		String result2;
		String result3;
		System.out.println("A structure that allows repeated execution of a block of statements is a ________\n1. cycle     3. ring\n "
				+ "2. loop     4. band");
		ans1 = input.nextInt();
		if(ans1 == 2) {
			result = "Correct";
		}
		else {
			result = "incorrect, correct answer was 2. loop";
		}
		System.out.println("A loop that never ends is a(n) _______ loop. \n1. iterative			3. structured\n2. infinite			4. illegal");
		ans2 = input.nextInt();
		if(ans2 == 2) {
			result2 = "Correct";
		}
		else {
			result2 = "incorrect, correct answer was 2. infinite";
		}
		System.out.println("To construct a loop that works correctly, you should initialize a loop control __________."
				+ "\n1. variable			3. structure\n2. constant			4. condition");
		ans3 = input.nextInt();
		if(ans3 == 1) {
			result3 = "correct";
		}
		else {
			result3 = "Incorrect the correct answer was 1. variable";
		}
		displayAnswers(result, result2, result3);
	}
	public static void displayAnswers(String result, String result2, String result3) {
		System.out.println(result + " " + result2 + " " + result3);
	}
}
