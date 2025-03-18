package Task12march;

public class March12taskMathFunc {
    public static void main(String[] args) {
        // X = 10, Y = 10, Z = 10 , to use math.funciton to solve this

            int x = 10;
            int y = 10;
            int z = 10;

            // Compute the expression: cube root of (x^2 + y^2 - |z|)
            double k = Math.cbrt(Math.pow(x, 2) + Math.pow(y, 2) - Math.abs(z));


            System.out.println("Result: " + k);
        }
}
