package session_6;

import java.util.Scanner;

public class Example_1_Conditional {
//while loop will repeat the loop based on the condition.
//remember: you CANNOT use else condition with while loop
	
	public static void main(String[] args) {
		System.out.println("can you guess my number?");
		System.out.println("my number is betwwen 1-9");
		int a= 5;
		
		Scanner ui= new Scanner(System.in); 
		int b= ui.nextInt();
		
		while(a!=b) {
			System.out.println("nope,try again.");
			b= ui.nextInt();
		}
		if(a==b) {
			System.out.println("LFG! you got it.");
		}
		
		
		ui.close();
	}

}
