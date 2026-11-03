package Assignment_13;

public class Task_3 {
    public static void main(String[] args) {
        String palindrome = "racecar";
        String reversed = new StringBuilder(palindrome).reverse().toString();

        if (palindrome.equals(reversed)) {
            System.out.println(palindrome + " is a palindrome");
        } else {
            System.out.println(palindrome + " is not a palindrome");
        }

        String word = "abc";
        for (int start = 0; start < word.length(); start++) {
            for (int end = start + 1; end <= word.length(); end++) {
                System.out.println(word.substring(start, end));
            }
        }
    }
}
