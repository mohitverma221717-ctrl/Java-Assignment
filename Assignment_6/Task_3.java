package Assignment_6;

public class Task_3 {
    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 9, 7};
        int repeatedValue = 0;
        boolean foundRepeatedValue = false;

        for (int i = 0; i < arr.length && !foundRepeatedValue; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    repeatedValue = arr[i];
                    foundRepeatedValue = true;
                    break;
                }
            }
        }

        if (foundRepeatedValue) {
            System.out.println("Repeated value: " + repeatedValue);
        } else {
            System.out.println("No repeated value");
        }
    }
}
