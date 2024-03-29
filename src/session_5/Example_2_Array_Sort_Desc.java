package session_5;

import java.util.Arrays;
import java.util.Collections;

public class Example_2_Array_Sort_Desc {
//PRACTICE LOTS FOR INTERVIEW
	public static void main(String[] args) {
		
// int array
			Integer [] x= {33,6,8,45,9,15,5}; //change int to Integer
				

			Arrays.sort(x,Collections.reverseOrder()); //import Collections 
				
			System.out.println(x[0]);
			System.out.println(Arrays.toString(x));
				
				
//string array 
			String [] y= {"apple", "orange", "kiwi", "papaya", "mango"};
				
			Arrays.sort(y,Collections.reverseOrder()); //import Collections
				
			System.out.println(y[3]);
			System.out.println(Arrays.deepToString(y));
				
			}
		
}


