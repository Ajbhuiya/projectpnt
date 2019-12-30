package basics1.basic1;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {
        Scanner stName=new Scanner(System.in);

        System.out.println("Enter your Name");
        String studentName=stName.nextLine();
        System.out.println("Student Name"+studentName);


        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Salary");
        double salary=input.nextDouble();
        System.out.println("My Salary is "+salary);

        System.out.println("Enter your age");
        int age=input.nextInt();
        System.out.println("My Age is "+age);




        stName.close();
        input.close();


    }
}