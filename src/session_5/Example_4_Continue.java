package session_5;

public class Example_4_Continue {

	public static void main(String[] args) {
		
		String [] y= {"apple", "orange", "kiwi", "papaya", "mango"};
		
		for(String i: y) {
			if (i.contains("papaya")) {
				continue; // continue excludes ONLY the item in if condition
			}
			System.out.println(i); 
			
			}
		}

}
