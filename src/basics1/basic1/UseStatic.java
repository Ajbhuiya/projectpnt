package basics1.basic1;

import java.util.Scanner;

public class UseStatic {
	// Static: we put static in method or variable so we dont need to create object
	// The static keyword is used in java mainly for memory management.
	//Static variable is called class vriable, same for static method
	// It is used with variables, methods, blocks and nested class.
	// It is a keyword that are used for share the same variable or method of a given class.
	// This is used for a constant variable or a method that is the same for every instance of a class.

	static String name = "James William"; // class Variable
	static String address="Jamaica,NY";//same meaning as having public in front


		public static void main (String[]args){

		UseStatic.name = "Jack";//reassigning name variable from line 1
			UseStatic.name="Mike";//renaming jack
			System.out.println(UseStatic.name);

			UseStatic.address="Brooklyn,NY"; //reassigning values

			System.out.println(UseStatic.address);
			checkEligibility();
		}
           static void checkEligibility(){
			int age;
			Scanner sc=new Scanner(System.in);
	System.out.println("What is your age?");
	age=sc.nextInt();

}

	}



