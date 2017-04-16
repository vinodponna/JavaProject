package lesson1;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter some number");
		int userip = scan.nextInt();
		System.out.println("The Entered value is : " );
		System.out.print(userip);
		
		@SuppressWarnings("resource")
		Scanner scan1= new Scanner(System.in);
		System.out.println("Enter some charater");
		String value = scan1.nextLine();
		System.out.println("The Entered value is : " );
		System.out.print(value);
	}

}
