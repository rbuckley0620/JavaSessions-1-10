package session_4;

import java.util.Scanner;

public class Example_9_While_Loop {
//the loop will continue to execute as long as conditions are met/true. 
	public static void main(String[] args) {

		Scanner ui = new Scanner(System.in);
		System.out.println("Give me your name.");
		String name = ui.nextLine();

		while (name.contains("B")) {
			System.out.println("That's a nice name. Give me another one. ");
			
			name = ui.nextLine();
		}
		System.out.println("Exit.");

		ui.close();
	}
}
