package mahmudabstraction;
//step3. put implements car after toyota on class
//toyota is concrete class(future) means this class will implement interface
//concrete class extends one class and multiple interfaces
//3.1 if we wanna add multiple interface. then we put a , and new name of interface after car
//3.2 to inherit abstract class we put extends Flyingcar ex.abstract method
public class Toyota extends FlyingCar implements Car{
//toyota is the child and getting properties from all other interface and class
    public void carStart() {
        System.out.println("start feature");
    }
    public void carStop() {
        System.out.println("stop feature");
    }
    public void carWheel() {
        System.out.println("has car wheels");
    }
    public void carEngine() {
        System.out.println("has engine");
    }
    public void flyingFeature() {
        System.out.println("flying feature");
    }
    //we create own method. can return or non return and variable
    public void gps(){
        System.out.println("Toyota has gps feature");
    }

}
