package basic;

public class useNonReturnMethod {

	/**
	 * non return type method
	 * it will not return anyting
	 * void
	 */
	static public void doDivision() {
		int number1= 60;
		int number2= 20;
		int division = number1/number2;
				System.out.println(division);
		
	}
	static public void doDivisionNewly(int num1, int num2) {
		//when its static we dont need object
		int number1= num1;
		int number2= num2;
		int division = number1/number2;
				System.out.println(division);
	}
	public static void main(String[] args) {
		useNonReturnMethod.doDivision();
		useNonReturnMethod objDiv = new useNonReturnMethod();
		
		
		
		
		
}
	
}
