import java.util.Scanner;

public class Session_4_HW {

	public static void main(String[] args) {
		Scanner ui = new Scanner (System.in); 
		
		System.out.println("Hello, what is your name? Where are you from? What is your gender?");
		String name= ui.next();
		String location= ui.next();
		String gender= ui.next();
		
		
		System.out.println(name + " , oh, that's a nice name . " + location +  " huh, that's cool, I've been there before and I loved it. " + gender + " ? You're a girl?. I initially thought you were a woman with that name.");
		
		
		
		
		ui.close();
	}

}
