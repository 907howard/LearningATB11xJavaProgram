package Tasks_April.April4thTask;

public class Method_Overloading {
}
class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(2, 3);
        c.add(2.5, 3.5);
    }
}