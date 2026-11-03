package Assignment_12;

public class Task_3 {
    public static void main(String[] args) {
        int[] values = {6, 5, 4, 3, 2, 1};
        int shifts = 0;

        for (int i = 1; i < values.length; i++) {
            int current = values[i];
            int j = i - 1;
            while (j >= 0 && values[j] > current) {
                values[j + 1] = values[j];
                j--;
                shifts++;
            }
            values[j + 1] = current;
        }

        System.out.println("Shifts: " + shifts);
    }
}
