package session_4;

import java.util.Scanner;

public class Example_4_MultipleConditions {

	public static void main(String[] args) {
		Scanner ui= new Scanner(System.in);
		System.out.println("What color apple do you want?");
		String color= ui.nextLine();
		
	if(color.contains("red")) {
		if (color.length()>2) {
			
		System.out.println("get the big apple.");
	System.out.println("get the red apple.");
		
	}
		else 
			System.out.println("Don't buy any apples");
	ui.close();
		}
	}
}
