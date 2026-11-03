package Assignment_15;

public class Task_2 {
    public static void main(String[] args) {
        StringBuilder numbers = new StringBuilder();

        for (int i = 1; i <= 5; i++) {
            numbers.append(i).append(',');
        }

        numbers.deleteCharAt(numbers.length() - 1);
        System.out.println(numbers);
    }
}
