package session_4;

import java.util.Scanner;

public class Example_2_IfElse_Scanner {

	public static void main(String[] args) {
		
		Scanner ui= new Scanner(System.in);
		System.out.println("What day is it?");
		String day= ui.nextLine();
		
	if(day.startsWith("t")) {
		System.out.println("Today is tuesday or thursday");
	}
	
	 else {
		 System.out.println("Today is NOT tuesday or thursday");
	 }
	ui.close();
	
	}

}
