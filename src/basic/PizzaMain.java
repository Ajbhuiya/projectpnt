package basic;

public class PizzaMain {
    public static void main(String[] args) {
        //3 create pizza pie object
        //Datatype, object name then initialization , value
        PizzaPie ajPizza = new PizzaPie();
        //once we create object we have access to all state and behavior of other class
        System.out.println(ajPizza.cheese);//printing out cheese
        //4 now if we we wanna change the cheese and create new pizza. we can add another constructor
        //5 create new pizza that will take in parameters from 4.5.
        //and we can use default constructor or new constructor
        PizzaPie yourPizzaPie = new PizzaPie("flour", "cheddar", 2, "extra cheesy") ;
        System.out.println(yourPizzaPie.toppings);
        System.out.printf(yourPizzaPie.type);
        //6 new constructor
        PizzaPie theirPizza= new PizzaPie();

    }

}


