package session_4;

import java.util.Scanner;

public class Ssn_4_HW {

	public static void main(String[] args) {
		Scanner ui = new Scanner(System.in);
		System.out.println("Give me any number.");
		
		int x=ui.nextInt();
		
		for (int i=0; i<x; i=i+4) {
			if (x==0) {
			System.out.println(i);
		}
			else {
			System.out.println(x);
		}
	
		
		
		
	ui.close();	
	}  
	
}
}

