package Assignment_11;

public class Task_3 {
    public static void main(String[] args) {
        int[] values = {5, 1, 4, 2, 8};
        int swaps = 0;

        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - 1 - i; j++) {
                if (values[j] > values[j + 1]) {
                    int temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;
                    swaps++;
                }
            }
        }

        System.out.println("Swaps: " + swaps);
    }
}
