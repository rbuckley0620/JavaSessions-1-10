package session_1;

import java.util.Scanner;

public class Practice_sesh {

	public static void main(String[] args) {
	Scanner ui= new Scanner(System.in);
	
	
	System.out.println("What kind of cars do you like? ");
	String response = ui.nextLine();	
	
	if(response.equalsIgnoreCase("ferrari")) {
		System.out.println("Italian brands, huh?. Nice");
	}
		
	else {
		System.out.println("cheap car.");
	}
			

	ui.close();
	}

}

