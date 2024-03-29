package session_6;

public class Example_3_Split {

	public static void main(String[] args) {
		
		String accounts = "a2452423, b34582452, c8665242, d4352424";

		String[] acc = accounts.split("b");
		
		System.out.println(acc[1]);
	}

}
