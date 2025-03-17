package ex_02_Java_Basic;

public class Lab023_printf {
    public static void main(String[] args) {

        int a =10;
        System.out.printf("your variable is %d", a);

        // %d --> int, byte, long, short, -date type
        // %s ->String
        // %d -> float, double
        // %b ->boolean
        int b = 10;
        System.out.println("-----");
        System.out.printf("%d + %d", a,b);

    }
}
