package session_1;

public class A {

	public static void main(String[] args) {
		
		a1();
		B.b1();
		System.out.println(a2(2,2)+1);
		System.out.println(B.b2(1, 1)+50);
		B.b3();
		
	}

	
	public static void a1() {
		
		int a = 5; 
		int b = 10;
		
		System.out.println(a+b);
				
	}
	public static int a2(int c, int d) {
		
		int e = 3; 
		int f = 6;
		System.out.println("I am learning how to create different methods and calling them.");
		System.out.println(e+f);
		System.out.println(c+d);
		return 69;
	}
	
		
		
}






