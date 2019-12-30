package mahmudabstraction;
//step 5 we can test concrete class toyota
public class Test {
    public static void main(String[] args) {
        Toyota toyota=new Toyota();
        toyota.carStart();//calling method
        toyota.carStop();
        toyota.carWheel();
        toyota.carEngine();
        toyota.flyingFeature();
        toyota.gps();

        //car type object by using toyota class because toyota class implements car
        Car newCar= new Toyota();//toyota is the constructor here. we only using car interface
        newCar.carEngine();
        newCar.carStart();
        newCar.carStop();
        newCar.carWheel();
        newCar.carWheel();
        ((Toyota) newCar).gps();//casting to get gps method

    }
}
