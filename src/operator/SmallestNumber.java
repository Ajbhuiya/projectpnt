package operator;

public class SmallestNumber {

    public static void main(String[] args) {
//step2:
        SmallestNumber sm=new SmallestNumber();//create object
        System.out.println(sm.smallestNumber());//print output
    }

    //step 1:now we need to create a method
    public int smallestNumber() {
        int number1 = 35;
        int number2 = 47;
        int number3 = 24;
       // Math.min(number1, number2);

        return Math.min(Math.min(number1, number2), number3);//calling method first.
        //then we pass parameter
    }

}


