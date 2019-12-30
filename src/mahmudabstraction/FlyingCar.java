package mahmudabstraction;
    //step2
    public abstract class FlyingCar {
          //also looks like interface , must make it abstract class in line 3
         //diff bet interface and abstract? we are not allowed to decalre non abstract method in interface
        // here we can abstract and non abstract method here

    public abstract void flyingFeature();//abstract can only
    //declare method but no body plus no static
    public void boostEngine(){//non abstract method can be declared and body
        System.out.println("Boost engine is enhanced");
        //non abstract method cannot be declared alone has to be declared
    }
    }


