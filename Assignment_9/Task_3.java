package Assignment_9;

public class Task_3 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int count = 0;

        for (int[] row : matrix) {
            for (int value : row) {
                if (value > 5) {
                    count++;
                }
            }
        }

        System.out.println("Values greater than 5: " + count);
    }
}
