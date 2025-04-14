package Tasks_April.April4thTask;

public class Method_Overridding {
}
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    @Override
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();  // overridden method
    }
}
