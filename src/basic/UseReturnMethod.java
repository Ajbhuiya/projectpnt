package basic;

public class UseReturnMethod {
	
	
	/**
	 * variable
	 * Method
	 * Return to Method
	 * AccessModifier ReturnTypee NameofMethod(){//body of the method}
	 *
	 */
	
	public int dosummation() {//nonparameter
		//access.returntype.method name
		int number1 = 50;
		int number2 = 60;
		int sum = number1+number2;
		System.out.println(sum);
		
		return sum;
		//has to be here for return type of method
		//method body starts here
		//method name is always lower
		//method name: verb+noun
		//return 
	
		//return has to be here after the method. has to be last lien of the body
	}
	
		public int doMultiply(int num1, int num2) {//parameter. its dynamic when its parameter
			int number1= num1;
			int number2=num2;
			int multiply = number1 * number2;
			System.out.println(multiply);
			return multiply;
			
		}
	
	
	public static void main(String[] args) {
		
		UseReturnMethod objsum= new UseReturnMethod();//we created this object
		//to add the sums in 16-17 we need to create an object
		
		objsum.dosummation();
		objsum.doMultiply(500,400);
		//dynamic -we can reuse this
		
		
		
	}
		
		
		
	}//method body ends here
	

