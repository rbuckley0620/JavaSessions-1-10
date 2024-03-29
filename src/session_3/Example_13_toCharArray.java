package session_3;

import java.util.Arrays;

public class Example_13_toCharArray {

	public static void main(String[] args) {
//converts string to array	
		
		String a = "Dragon";
//		char[] b = {'D','r','a','g','o','n'};
		
		String[] ab = a.split("");
		
		System.out.println(Arrays.toString(ab));
	}
}
