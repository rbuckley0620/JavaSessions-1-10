package session_4;

import java.util.Scanner;

public class Example_5_SwitchCase {

	public static void main(String[] args) {
		
		Scanner ui= new Scanner(System.in);
		System.out.println("What color apple do you want?");
		String color= ui.nextLine();
		
		if (color.length()>2) {
		switch(color) {
		
		case "red":
			System.out.println("get the red apple.");
			break;
			
		case "green":
			System.out.println("get the green apple.");
			break;
			
		case "yellow":
			System.out.println("get the yellow apple.");
			break;

//use default: if conditions aren't satisfied.
		default: System.out.println("don't buy any apples.");
		ui.close();
		}
		}
		else {
			System.out.println("color doesn't match.");
		}
		}
		

}
