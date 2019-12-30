package basic;

import java.util.Scanner;

public class Arrays {

    //static array is when size is fixed
    public static void main(String[] args) {
        //syntac: data type, name of array[]=new, datatype [];
        // the first[] indicates its a array, second one is how many variables u gona use
        int bucky[] = new int[10];//array. this one way
        bucky[0] = 87;
        bucky[1] = 543;
        bucky[2] = 837;
        bucky[3] = 5343;
        bucky[4] = 827;
        bucky[5] = 5453;
        bucky[6] = 847;
        bucky[7] = 5343;
        bucky[8] = 837;
        bucky[9] = 817;
        System.out.println(bucky[1]);
        System.out.println(bucky.length);//to print length of array


        int []hickey = {2, 4, 5, 7, 9};// we initialize values here and automaticaly counts and assigns values
        System.out.println(hickey[2]);
        System.out.println(hickey.length);

        int myArray[]={8,3,22,7,16,4,1,9};
        int number =myArray[0];
        int size=myArray.length;

        System.out.println(number);
        System.out.println();


       /* int i[] = new int[4];//array. this one way
        i[0] = 10;
        i[1] = 20;
        i[2] = 30;
        i[3] = 40;

        // to print all  the values of array use for loop
        for (int j = 0; j < i.length; j++) {
            System.out.println(i[j]);//i[j] is to check loop goes up to line 29, and not more
*/
            //double arrays
            double f[] = new double[3];
            f[0] = 12.23;
            f[1] = 13.55;
            f[2] = 15.30;
            System.out.println(f[1]);

            //char array
          /*  char f1[] = new char[3];
            f1[0] = 'n';
            f1[1] = 'd';
            f1[2] = 'c';*/
/*

            //object array(object is a class)-used to store diff data type values
            Object ib[] = new Object[4];
            ib[0] = "tom";
            ib[1] = 25;
            ib[3] = 12.35;
            ib[4] = "01/15";
            System.out.println(ib[4]);
*/

        String[]names = new String[5];//array. this one way. this array  holds size 5
        names[0] = "Joe";
        names[1] = "John";
        names[2] ="Sarah";
        names[3] = "Tim";
        names[4] = "Bob";

        System.out.println(names[1]);//prints out john
        System.out.println(names.length);//to print
        //do it using for loop
        for(String n:names){//this is one way
            System.out.println(n);

            for(int i=0; i<=5;i++){//another way
                System.out.println(names[i]);

                for(int j=0; j<names.length;j++){//another way
                    System.out.println(names[j]);


                    //create an array of size 50
                    //add in numbers from 1-50 into the array respectively
                   int[] numArray=new int[50];

                   for(int k=0;k<numArray.length;k++) {
                       System.out.println(names[k]);//to initialize
                       numArray[k] = k + 1;
                   }
                       for(int k=0;k<numArray.length;k++){
                           System.out.println(numArray[k]);//to print
                    }
                      /* //print from 1-1million and divisible by 3 and 5
                       int [] herArray = new int[15];//int array of size 15 and its empty
                        for(int l=1; int <=1000000;l++){
                        //check if i is divisible by both 3 and 5
                    //if so then add "i" tot he array and do until array is full*///skip this

                }

            }

        }

        }

    }

