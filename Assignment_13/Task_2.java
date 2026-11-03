package Assignment_13;

public class Task_2 {
    public static void main(String[] args) {
        String word = "Java";
        String reversed = "";

        for (int i = 0; i < word.length(); i++) {
            reversed = word.charAt(i) + reversed;
        }

        System.out.println("Reversed: " + reversed);
    }
}
