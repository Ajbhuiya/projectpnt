package loop;

public class DoWhileLoop {

// ---------------------------------------- Do-While ----------------------------------------------------------
    // The Java programming language also provides a do-while statement, which can be expressed as follows:

    //do {
    //     statement(s)
    //} while (expression);

    // The difference between do-while and while is that do-while evaluates its expression at the bottom of the loop
    // instead of the top. Therefore, the statements within the do block are always executed at least once

    public static void main(String[] args) {

        int count=0;

        do{
            // Do Block
            System.out.println("Count is "+count);
            count++;
        } while (count<6);



    }
}