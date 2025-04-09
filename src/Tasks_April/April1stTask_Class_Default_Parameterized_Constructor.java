package Tasks_April;

public class April1stTask_Class_Default_Parameterized_Constructor {
    public static void main(String[] args) {
//Create a Class with the Person - where we have DC, PC , two types.
//
//Fields. Instances - name, age, address, phone, isMale.
//
//Behaviour - eat, sleep, walk, doHome, printDetails()- print the details of the all the fields.
        //default constructor calling example

        Person p1 = new Person();
        //Parametrized constructor calling example
        Person p2 =  new Person("Max", 20);

        p1.eat();
        p1.sleep();
        p1.walk();
        p2.doHome();
        p2.printDetails();

        }
    }

class Person {
    String name = "zack";
    int age = 20;
    String address = "1x";
    int phone = 12345;
    boolean isMale = true;

        Person(){
            System.out.println("This is a default contructor example");
            }
        Person(String n,int a){
            this.name = n;
            this.age = a;
            System.out.println("This is parametrized contructor example");
            }
    void eat() {
        System.out.println("Person is eating");
    }

    void sleep() {
        System.out.println("Person is sleeping");
    }

    void walk() {
        System.out.println("Person is walking");
    }

    void doHome() {
        System.out.println("Person is doing work");
    }

    void printDetails() {
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("adress is " + address);
        System.out.println("phone is " + phone);
        System.out.println("Whether person is male or not " + isMale);
    }
}

