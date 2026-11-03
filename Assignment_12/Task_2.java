package Assignment_12;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] values = {14, 3, 9, 21, 6};

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
