package Opps_Code;

class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running fast");
    }
}

public class OverridingDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike(); // runtime polymorphism
        v.run(); // calls Bike's run()
    }
}
