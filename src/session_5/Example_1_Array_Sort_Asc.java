package session_5;

import java.util.Arrays;

public class Example_1_Array_Sort_Asc {
//PRACTICE LOTS FOR INTERVIEW
	public static void main(String[] args) {
// int x= ___
//(int i=0; i<=10; i++){sysyo(x)} (asc)
//(int i=0; i>=10; i--){syso (x)} (desc)
		
// int array
		int [] x= {33,6,8,45,9,15,5};
		

		Arrays.sort(x); //import int array
		
		System.out.println(x[0]);
		System.out.println(Arrays.toString(x));
		
		
//string array 
		String [] y= {"apple", "orange", "kiwi", "papaya", "mango"};
		
		Arrays.sort(y);
		
		System.out.println(y[0]);
		System.out.println(Arrays.deepToString(y));
		
	}

}
