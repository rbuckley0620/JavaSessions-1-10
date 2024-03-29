package session_3;

import java.util.Scanner;

public class Example_1and2_Length {

	public static void main(String[] args) {
		
//example 1 (length)		
		Scanner ui= new Scanner(System.in);
		
		System.out.println("What is your name:");
		
		String name=ui.nextLine();
		
		System.out.println(name);
		
		int len=name.length();	
		
		System.out.println("length of the name is:"+len);
		
		ui.close();
		
//example 2 (length)
		
		String ab="Blue"; 
		System.out.println(ab.length());
	}

}
