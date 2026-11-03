package Assignment_9;

public class Task_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for (int column = 0; column < matrix[0].length; column++) {
            int sum = 0;
            for (int row = 0; row < matrix.length; row++) {
                sum += matrix[row][column];
            }
            System.out.println("Column " + (column + 1) + " sum: " + sum);
        }
    }
}
