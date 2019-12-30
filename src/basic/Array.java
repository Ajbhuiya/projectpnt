package basic;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int a[]=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("enter an integer");
            a[i]= sc.nextInt();
            sum=sum+a[i];

        }
        System.out.println("the sum of the arrays values is"+" "+sum);







    }
}
