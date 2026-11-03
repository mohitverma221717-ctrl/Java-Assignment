package Assignment_5;

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {5, 12, 2, 14, 7};
        int count = 0;

        for (int value : arr) {
            if (value > 10) {
                count++;
            }
        }

        System.out.println("Count greater than 10: " + count);
    }
}
