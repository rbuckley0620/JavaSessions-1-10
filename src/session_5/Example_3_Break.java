package session_5;

public class Example_3_Break {

	public static void main(String[] args) {
		
		
	String [] y= {"apple", "orange", "kiwi", "papaya", "mango"};
	
	for(String i: y) {
		if (i.contains("papaya")) {
			break; // break does not include items after the item typed in if condition
		}
		System.out.println(i); 
		
		}
	}
}
