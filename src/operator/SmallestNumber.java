package operator;

public class SmallestNumber {

    public static void main(String[] args) {
//step2:
        SmallestNumber sm = new SmallestNumber();//create object
        System.out.println(sm.lowestNumber()); //print output

    }

    public int lowestNumber() {
        int a = 10;
        int b = 20;
        int c = 30;

        return Math.min(Math.min(a, b), c);

    }

}
