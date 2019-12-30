package Abstraction5;
//this is concrete class
public class IPhone extends SmartPhone implements Phone {


    public IPhone(){}
//declare method and implements

    public void turnOn() {
        System.out.println("iphone can turn on");
    }

    public void turnOff() {
        System.out.println("Iphone can turn off");
    }

    public void playMusic() {
        System.out.println("iphone can play music");
    }

    public void useInternet() {
        System.out.println("iphone can use internet");

    }

    public void checkEmail() {
        System.out.println("iphone can check email");
    }

    public void watchYoutube() {
        System.out.println("i can watch youtube");
    }
}
