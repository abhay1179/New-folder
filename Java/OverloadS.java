public class OverloadS {

    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadS abh = new OverloadS(); // Correct class name
        System.out.println("Sum (int): " + abh.sum(5, 8));
        System.out.println("Sum (double): " + abh.sum(3.5, 6.2));
    }
}