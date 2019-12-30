package loop;

public class IncrementAndDecrementOperator {
    public static void main(String[] args) {
       // increment ++
        //decrement --
        int i =1;
        int j=i++;//postincrement. So value of i is given to J which is 1
        //then i is increased by 1 and is 2 now . so i=2=j=1

        System.out.println(i);
        System.out.println(j);

        int a=1;
        int b=++a;//preincrement means icrease a by 1 first
        System.out.println(a);
        System.out.println(b);
        //a is gonna be 2 cuz its preincrement 1+1 will be 2.then assign
        //a to b which is 2

        //post decrement
        int m=2;
        int n=m--;
        System.out.println(m);//so take m and give it to n. then decrease m by 1.so m=1 and n is 2
        System.out.println(n);//

        //predecrement
        int p1 =2;//1
        int q1 =--p1;//1
        System.out.println(p1);
        System.out.printf(String.valueOf(q1));



    }

}
