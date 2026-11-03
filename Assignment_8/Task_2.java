package Assignment_8;

public class Task_2 {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] transpose = new int[3][3];

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                transpose[column][row] = matrix[row][column];
            }
        }

        for (int[] row : transpose) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
