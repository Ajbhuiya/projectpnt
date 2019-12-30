package basic;

import javax.imageio.stream.ImageInputStream;

public class PizzaPie {
    //1 -variables are the state. try not to initialize here try in constructors
    String dough="Standard";
    String cheese="extra";
    int toppings = 3;
    boolean isThereSauce=true;
    char size='M';
    double price=10.50;
    String type="regular";
    boolean Customized=false;

    //3.5-constructor= whenever you need to create an object of a class
    //we need to create a constructor
    public PizzaPie(){ }
//6constructor with all variables
    public PizzaPie(String dough, String cheese, int toppings, boolean isThereSauce, char size, double price, String type, boolean customized) {
        this.dough = dough;
        this.cheese = cheese;
        this.toppings = toppings;
        this.isThereSauce = isThereSauce;
        this.size = size;
        this.price = price;
        this.type = type;
        Customized = customized;
    }

    //4.5create anoter constructor with these variables on top
    public PizzaPie(String dough, String cheese, int toppings, String type ){
    //now anyone can create pizza object and specify the variables
        this.dough=dough; //this. is saying first dough from class
        this.cheese=cheese;
        this.toppings=toppings;
        this.type=type;
        //always try to use this




    }

    //2-behaviour
    public void isBaked() {
        System.out.println("Bake Pizza");
    }
    public void getConsumed() {
        System.out.println("Pizza is consumed");
    }
    public void getSliced() {
        System.out.println("Pizza is sliced");
    }
}
