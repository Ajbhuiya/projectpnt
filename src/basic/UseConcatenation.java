package basic;

public class UseConcatenation {
	public static void main(String[] args) {
		//concatination is adding variable with statement
		String fName="james";
		String lName="Willim";
		
		System.out.println("My first name is "+ fName);
		System.out.println("My first name is "+ lName);
		System.out.println("My first name is "+ fName + " " +"last name is"+lName);//""= adding space
		
		System.out.println(fName.concat( lName));
		
		
	}

}
