package session_2;

import java.util.Scanner;

public class HW_practice2 {
	
	public static void main(String[] args) {
		
		practice();
		
	}
		
	public static void practice() {
		
		Scanner scan= new Scanner(System.in);
		Scanner scan1= new Scanner(System.in);
		
		System.out.println("Hey sexy, what is your name?");
		String name = scan.nextLine();
		
		System.out.println("That's cool, how old are you?");
		int age = scan1.nextInt();
		
		System.out.println("My name is " + name + ". I am " + age + " years old.");
		
		scan.close();
		scan1.close();
	}
	
	
}
