package controlflow;

public class UseCasting {
    // converting data type ex int to double
    //only can convert primitive to primitive
    //byte range is up to 127. if over it will be negative
    public static void main(String[] args) {
        int a= 50;
        double newa=(double) a;
        int t= (int) 60.0;
        System.out.println(newa);
        System.out.println(t);
    }
   /* doCast();//calling method with method name
        doCast2();
        double salary = 5000.500;
        int newSalary = (int) salary;//inside the () we say what type
        //of data we converting. int newSalary is a new variable we create
        int number = (int) 60.75; // we converting 60.75 to int
        int number2 = (int) 400.50;
        byte x = (byte) salary;
        byte x2 = (byte) 130;
        int f= (int) 55.50;

        System.out.println(newSalary);
        System.out.println(number);
        System.out.println(x);
        System.out.println(x2);
        System.out.println(f);
    }
    public static void doCast(){
        int age = 20;
        double newAge =(double) age;
        System.out.println(newAge );
    }
    public static void doCast2(){
        int age =10;
        double age2=(double) age;
        System.out.println(age2);

    }*/
}