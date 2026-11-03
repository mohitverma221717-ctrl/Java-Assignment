package Assignment_14;

public class Task_1 {
    public static void main(String[] args) {
        String s = "programming";
        int vowels = 0;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                vowels++;
            }
        }

        System.out.println("Vowels: " + vowels);
    }
}
