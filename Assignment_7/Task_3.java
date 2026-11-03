package Assignment_7;

public class Task_3 {
    public static void main(String[] args) {
        int n = 1024;
        int steps = 0;

        // Time complexity: O(log n)
        while (n > 1) {
            n /= 2;
            steps++;
        }

        System.out.println("Halving steps: " + steps);
    }
}
