package session_4;

import java.util.Scanner;

public class Example_3_Else_If {

	public static void main(String[] args) {
		
		Scanner ui= new Scanner(System.in);
		System.out.println("What color apple do you want?");
		String color= ui.nextLine();
		
	if(color.contains("red")) {
		System.out.println("get the red apple.");
	}
	
	 else if(color.contains("green")) {
		 System.out.println("get the green apple.");
	 }
	 else {
		 System.out.println("Don't buy any apples.");
	 }
	ui.close();
		
	}

}
