package ex_18_OOPs_Inheritance.Multilevel;

public class Lab018_01_Multi_Level {

    public static void main(String[] args) {
        Father father = new Father();
        father.gold();
        father.property();

        System.out.println("---------");
        GrandFather grandFather= new GrandFather();
        grandFather.gold();
        grandFather.property();

        System.out.println("---------");

        GrandFather grandFather1 = new Father();    // Dynamic Dispatch
        grandFather1.gold();
        grandFather1.property();

        System.out.println("---------");

        Son son = new Son();
        son.gold();
        son.property();
        System.out.println("---------");

        Father f = new Son();
        f.gold();
        f.property();


    }
}