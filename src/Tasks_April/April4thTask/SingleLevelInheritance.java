package Tasks_April.April4thTask;
//Create Single level Inteheritancce
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // inherited
        d.bark();
    }
}

