package controlflow;

public class UseNestedIfElse {
    public static void main(String[] args) {
        //its one if inside another if ex. u go to amazon.com and search for iphone
        //then we filter by prices
        //if parent condition meets then it will go child if condition
        //other wise it will go for else block
        int age=25;
        if(age>18){
            System.out.println("you are adult");
            if(age>10){
                System.out.println("you are teen");
            }else {
                System.out.println("you are not teen");
            }

        }else {
            System.out.println("You are not adult");
        }
    }

/*

    public static void main(String[] args) {
        int age = 28;
        if (age > 18) {
            System.out.println("You are Adult");

            if (age > 10) {
                System.out.println("You are Teenager");
            } else {
                System.out.println("you are not Teenager");
            }

        } else {
            System.out.println("You are not Adult");
        }

    }
}*/
}