package Assignment_4;

public class Task_2 {
    private static long fact(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    private static long nPr(int n, int r) {
        return fact(n) / fact(n - r);
    }

    public static void main(String[] args) {
        System.out.println("5P2 = " + nPr(5, 2));
    }
}
