package basics1.basic1;

public class UseCasting {

	
	public static void main(String[] args) {
		
	// you cannot convert primitive to non primitivr
	//casting is converting data type ex int to double
	double salary = 5000.500;
	int newSalary= (int) salary;
	int number = (int) 60.75;// convert number to integer
	byte x=(byte)salary;
	byte y=(byte)130;
	
	System.out.println(newSalary);
	System.out.println(number);
	System.out.println(x);
	
	
}
}