package Assignment_3;

public class Task_2 {
     public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {      // rows
            for (int j = 1; j <= i; j++) {  // stars in each row
                System.out.print("*");
            }
            System.out.println();
        }
    }
}