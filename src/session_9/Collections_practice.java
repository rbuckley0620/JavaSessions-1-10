package session_9;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections_practice {

	public static void main(String[] args) {
		
Map<String,Integer> col = new TreeMap<String, Integer>();
		
		col.put("Bobby", 10);
		col.put("Allen", 9); 
		col.put("Sammy", 8); 
		col.put("Griffin",7);
		col.put("Bobby", 6); 
		col.put("Candice", 5);
		
		System.out.println(col);
		System.out.println(col.size());
		
		System.out.println("------------------------");
		
		Set<String> col1 = new TreeSet<String>();
		
		col1.add("Bobby");
		col1.add("Allen"); 
		col1.add("Sammy"); 
		col1.add("Griffin");
		col1.add("Bobby"); 
		col1.add("Candice");
		
		System.out.println(col1);
		System.out.println(col1.size());

	}
// you can substitute the interface and collection names.
}
