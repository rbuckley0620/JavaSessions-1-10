package session_2;

import java.util.Scanner;

public class HW_1 {

	public static void main(String[] args) {

		assignment();
	}

	public static void assignment() {

		Scanner scan = new Scanner(System.in);
		Scanner scan1 = new Scanner(System.in);

		System.out.println("What is your name?");
		String name = scan.nextLine();

		System.out.println("How old are you?");
		int age = scan1.nextInt();

		System.out.println("What is your gender?");
		String gender = scan.nextLine();

		System.out.println("Where are you from");
		String address1 = scan.nextLine();

		System.out.println("Where do you live now?");
		String address2 = scan.nextLine();

		System.out.println("Where do you work?");
		String company = scan.nextLine();

		System.out.println("What is your jobs role");
		String role = scan.nextLine();

		System.out.println("What is your Salary?");
		int salary = scan1.nextInt();

		System.out.println("How much raise are you getting next year?");
		int raise = scan1.nextInt();
		
		int totalSalary = salary + raise; 
		
		System.out.println("My name is " + name + ". I am " + age + " years old, " + gender + ". I am from " + address1 +
". I currently live in " + address2 + ". I work at " + company + ". My role is " + role + ". I make " + salary + ". I will get a raise of " + raise + ". My total salary next year would be " + totalSalary);
		

		scan.close();
		scan1.close();

	}

}
