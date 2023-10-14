package shinde;

public class CalculateE {

    public static void main(String[] args) {
        double e = 1.0;
        for (int i = 1; i <= 5; i++) {
            e += 1.0 / factorial(i);
        }
        System.out.println("Value of e up to 5 terms: " + e);
    }

    public static long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
