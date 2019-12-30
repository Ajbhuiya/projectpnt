package constructors;

public class Car {


    private String brand;
    String model;
    String year;
    double price;
    boolean isUsed;

    public Car(String brand, String model, String year, double price, boolean isUsed) {
        this.brand = "Honda";
        this.model = "Accord";
        this.year = "2019";
        this.price = 30.500;
        this.isUsed = true;
    }
    public static void doStart(){
        System.out.println("Car should start");

    }
    public static void doStop(){
        System.out.println("car should stop");

    }

    public String getBrand() {//always get and then variable name
        return brand;//we are returning the brand
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
