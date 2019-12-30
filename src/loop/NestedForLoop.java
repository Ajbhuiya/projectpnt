package loop;
import java.util.Scanner;
public class NestedForLoop {

        // User will give the number and it will print as a Row Basis
        // print this Output below:
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        System.out.println("Enter the Numb5er of Row");

        int numOfRow = number.nextInt();

        for (int i = 1; i <= numOfRow; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

//nested for loop
           /* for (int i = 0; i < 4; i++) {//syntax: for(inti;terminate;incordec){}

                System.out.println("Beginning of the phase is " + i);
                for (int k = 0; k < 6; k++) {
                    System.out.println("i=" + i + "k= " + k);
                }
                System.out.println("The end of he phase is " + i + "\n");
                ;*/

//i will be 0 because i =0
                //first loop will be printing first line and last line
            }


        }


    }
