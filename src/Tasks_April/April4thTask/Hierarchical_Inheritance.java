package Tasks_April.April4thTask;

public class Hierarchical_Inheritance {
}
class Parent {
    void parentMethod() {
        System.out.println("Parent class");
    }
}

class Child1 extends Parent {
    void child1Method() {
        System.out.println("Child 1");
    }
}

class Child2 extends Parent {
    void child2Method() {
        System.out.println("Child 2");
    }

    public static void main(String[] args) {
        Child1 c1 = new Child1();
        Child2 c2 = new Child2();
        c1.parentMethod();
        c1.child1Method();
        c2.parentMethod();
        c2.child2Method();
    }
}
