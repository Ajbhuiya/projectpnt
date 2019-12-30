package Singleton;

public class TestSingleton {
    public static class TestMain {


        public static void main(String[] args) {
            // Create an instance of the singleton class
            // Note: We are not using the "new" keyword here.
            // This is because we are creating an instance of the class using
            // the getInstance() method, rather than using a constructor


            SingletonDemo firstInstance = SingletonDemo.getInstance();
            firstInstance.doSomething();


            firstInstance.setName("Robin");
            String name = firstInstance.getName();
            System.out.println(name);
        }
    }
}
