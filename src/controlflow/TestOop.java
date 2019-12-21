package controlflow;

import basic.AccessModifier;
// or we can do import.basic.*;

public class TestOop {
    public static void main(String[] args) {
        AccessModifier acm = new AccessModifier();// we can create object from diff class becuz of line 3
        acm.studentName="Jack";
        System.out.println(acm.studentName);
    }
}
