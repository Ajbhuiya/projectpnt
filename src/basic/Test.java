package basic;

public class Test {
    public static void main(String[] args) {
        AccessModifier ac= new AccessModifier();//object
        ac.studentName="Abdul Bhuiya"; //calling sname from access mod class. because its public
        System.out.println(ac.studentName);
        //ac.studentContactNumber="123456";//we cant call private from another class
        ac.studentID="st123456";
        System.out.println(ac.studentID);
        //step2: now we gonna use protected variable studentContactnumber.
        //lets create a class in controlflow package call Testoop


    }
}
