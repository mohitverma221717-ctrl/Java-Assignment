package Assignment_2;

public class Task_4 {
     public static void main(String[] args) {
        int factorial = 1;

        for (int i = 1; i <= 5; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of 5 is " + factorial);
    }
}
