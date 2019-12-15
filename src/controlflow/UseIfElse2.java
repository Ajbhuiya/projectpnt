package controlflow;

import java.sql.SQLOutput;

public class UseIfElse2 {
    public static void main(String[] args){
        int age = 50;
        int age2= 60;

        if(age<60) {
            System.out.println("age is less than age 2");
        }
        else System.out.println("age 2 is greater");

        if(age==age2){
            System.out.println("age and age 2 are equallll");
        }
        else System.out.println("age and age 2 are not equal");

        if(age<age2){
            System.out.println("age is greater than age 2");
        }
        else System.out.println("age 2 is greater");


        if(age>age2){
            System.out.println("age is greater than age 2 ");
        }
        else{
            System.out.println("age 2 is greater than age 1");

        }
        if (age==age2) {
            System.out.println("age and age 2 are equal");
        }
            else {
            System.out.println("age and age2 are not equal");
        }

            }
        }






