package controlflow;

public class UseIfElseIf {

    public static void main(String[] args) {
        int testScore=70;
        String grade;

        if (testScore>90){
            grade="A";
        } else if (testScore>80){
            grade="B";
        } else if (testScore>=70){
            grade="c";
        } else if (testScore>60){
            grade="D";
        } else {
            grade="F";
        }
        System.out.println("Your Grade is "+grade);


    }


}
