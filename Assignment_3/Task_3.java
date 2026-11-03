package Assignment_3;

public class Task_3 {
     public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      // rows
            for (int j = 1; j <= i; j++) {  // numbers in each row
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
