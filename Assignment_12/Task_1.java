package Assignment_12;

import java.util.Arrays;

public class Task_1 {
    public static void main(String[] args) {
        int[] values = {7, 3, 5, 1};

        for (int i = 1; i < values.length; i++) {
            int current = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > current) {
                values[j + 1] = values[j];
                j--;
            }
            values[j + 1] = current;
        }

        System.out.println("Sorted: " + Arrays.toString(values));
    }
}
