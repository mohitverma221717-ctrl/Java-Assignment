package Assignment_11;

import java.util.Arrays;

public class Task_2 {
    public static void main(String[] args) {
        int[] values = {64, 25, 12, 22, 11};

        for (int i = 0; i < values.length - 1; i++) {
            int minimumIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = values[i];
            values[i] = values[minimumIndex];
            values[minimumIndex] = temp;
        }

        System.out.println("Sorted: " + Arrays.toString(values));
    }
}
