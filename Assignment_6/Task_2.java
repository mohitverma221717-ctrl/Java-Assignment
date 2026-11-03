package Assignment_6;

public class Task_2 {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 8, 3, 4};
        int smallest = arr[0];
        int smallestIndex = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                smallestIndex = i;
            }
        }

        System.out.println("Smallest: " + smallest + " at index " + smallestIndex);
    }
}
