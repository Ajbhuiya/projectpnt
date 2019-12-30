package operator;

public class SmallestNumber {

    int a = 20;
    int b = 30;
    int c = 40;


    public static void main(String[] args) {

        SmallestNumber sm = new SmallestNumber();
        System.out.println(sm.smallestNumber());

    }

    public int smallestNumber() {

        return Math.max(Math.max(a, b), c);


    }

    int a1 = 20;
    int b1 = 30;

    public int sm() {

        return Math.min(a1, b1);

    }
}