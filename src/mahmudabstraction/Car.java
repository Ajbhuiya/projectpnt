package mahmudabstraction;

public interface Car {//step1
    //interface is a prototype or guideline for future
    //interface is 100% abstract. these are abstract methods
    //we can declare method only
    //we can only initialized variable.
    //only public is allowed

    public void carStart();
    public void carStop();
    public void carWheel();
    public void carEngine();

    public String carName="Ajcar";
}
