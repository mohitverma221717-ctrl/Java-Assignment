package Assignment_8;

public class Task_1 {
    public static void main(String[] args) {
        int[][] m = new int[3][4];
        int value = 1;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = value++;
            }
        }

        for (int[] row : m) {
            for (int number : row) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
