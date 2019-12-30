package constructor;
//this is the blueprint for cars

public class Car {
    //step 1
    /*String  cBrand;
    public String cModel;
    int cYear;
    double cPrice;
    boolean isUsed;//public don't always have to be here*/
    //step5- set top variables to private so we can protect data
    private String cBrand;
    private String cModel;
    private int cYear;
    private double cPrice;
    private boolean isUsed;


    //step 2 create constructor
    public Car() {
    }

    //this constructor takes 3 variables
    public Car(String cBrand, String cModel, int cYear) {
        this.cBrand = cBrand;
        this.cModel = cModel;
        this.cYear = cYear;
    }

    //this takes all variables
    public Car(String cBrand, String cModel,
               int cYear, double cPrice, boolean isUsed) {
        this.cBrand = cBrand;
        this.cModel = cModel;
        this.cYear = cYear;
        this.cPrice = cPrice;
        this.isUsed = isUsed;
    }

    //step 6 create getter and setter
    public String getcBrand() {//for get we dont need parameters cuz we getting from class level
        return this.cBrand;
    }

    public void setcBrand(String brand) { //setters are void cuz we  not getting anything return just initializing
        //that field to new value.. so it does require parameters
        this.cBrand=cBrand;//we can use class cbrand and pass to whatver value is passed from paramter
    }

    public String getcModel() {
        return cModel;
    }

    public void setcModel(String cModel) {
        this.cModel = cModel;
    }

    public int getcYear() {
        return cYear;
    }

    public void setcYear(int cYear) {
        this.cYear = cYear;
    }

    public double getcPrice() {
        return cPrice;
    }

    public void setcPrice(double cPrice) {
        this.cPrice = cPrice;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    //step 3= create3 methods
    public void startCar(){
        System.out.println("car starts");
     }
    public void turnOff(){
        System.out.println("car turns off");
    }



}
