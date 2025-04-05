package Tasks_march;

public class March31stTask_Class_attributes {
    public static void main(String[] args) {
/*
        Create a Class of a Person with A - 10, B - all 4 types of methods

// 1.Without Parameters and Without Return Type
// 2.Without Parameters but With Return Type
// 3.With Parameters and Without Return Type
// 4. With Parameters and With Return Type

 */
Person p = new Person();
p.b1();
p.n();
p.b2(6);
p.c("Zack");


    }
}

class Person {

    String name ;
    String gender ;
    String  country ;
    String city ;
    int age ;
    String profession ;
    float salary ;
    float weight ;


    void b1(){
        System.out.println("This funct is without any return type and without any parameter");
    }


    String n(){
        System.out.println("Without Parameters but With Return Type");
        return "Hello" ;
    }

    void b2(int a){
        System.out.println("With Parameters and Without Return Type");
    }

    String c(String z){
        System.out.println("With Parameters and With Return Type");
        System.out.println(z);
        return z;

    }


}

