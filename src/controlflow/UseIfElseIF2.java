package controlflow;

public class UseIfElseIF2 {
    public static void main(String[] args) {

        int testScore = 70;
        String grade;

        if (testScore < 80) {
            grade = "B";
        } else if (testScore < 70) {
            grade = "c";
        }
        else if (testScore > 80)
        {
            grade = "B+";
        }
        else{
            grade = "f";
        }
        System.out.println("your grade is" + grade);
    }
}