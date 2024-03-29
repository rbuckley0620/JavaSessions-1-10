package session_1;

import java.util.Scanner;

public class Class_2 {

	public static void main(String[] args) {
		
		add();

	}

	public static void add() {
		
	Scanner scan= new Scanner(System.in);
	
	System.out.println("What is your name?");
		
	String answer= scan.nextLine();
	
	System.out.println("What is your age?");
	
	
	String  answer1= scan.nextLine();
	
	
	System.out.println(" My name is: " +answer);
	
	System.out.println(" I am " +answer1+ " years old ");

	scan.close();
		
	}

}
