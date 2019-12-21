package controlflow;

public class UseCasting {
    // converting data type ex int to double
    //only can convert primitive to primitive
    //byte range is up to 127. if over it will be negative
    public static void main(String[] args) {
    UseCasting.doCast();
        double salary = 5000.500;
        int newSalary = (int) salary;//inside the () we say what type
        //of data we converting. int newSalary is a new variable we create
        int number = (int) 60.75; // we converting 60.75 to int
        byte x = (byte) salary;
        byte x2 = (byte) 130;
        System.out.println(newSalary);
        System.out.println(number);
        System.out.println(x);
        System.out.println(x2);
    }
    public static void doCast(){
        int age = 20;
        double newAge =(double) age;
        System.out.println(newAge );
    }
}