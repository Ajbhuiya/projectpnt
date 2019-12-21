package controlflow;

public class UseIfElseIf {
    //else if means again if

    public static void main(String[] args) {
        int testScore=70;
        String grade;

        if (testScore>90) {
            grade = "A";
        }else if (testScore>80){
            grade="A-";
        }else if (testScore>70){
            grade="B";
        }else if (testScore>60){
            grade="B-";
        }else if (testScore>50){
            grade="c";
        }else {
            grade="F";
        }
        System.out.println("your Grade is "+grade);
        /*int testScore=70;
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
*/

    }


}
