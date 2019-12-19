package loop;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {

        System.out.println("Enter your Name");
        Scanner sc= new Scanner(System.in);//create scanner object
        String studentName= sc.next();
        System.out.println("Student name is:"+studentName);


    }

}
