class Multiply {
    void mul(int a, int b) {
        System.out.println("Multiplication of two numbers= " + (a * b));
    }

    void mul(int a, int b, int c) {
        System.out.println("Multiplication of three numbers= " + (a * b * c));
    }
}
public class CompileTimePolymorphism {
    public static void main(String args[]) {
        Multiply m = new Multiply();
        m.mul(6, 10);
        m.mul(10, 6, 5);
    }
}
