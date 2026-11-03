package Assignment_9;

public class Task_1 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.print("First row: ");
        for (int value : matrix[0]) {
            System.out.print(value + " ");
        }
        System.out.println();

        System.out.print("Last row: ");
        for (int value : matrix[matrix.length - 1]) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
