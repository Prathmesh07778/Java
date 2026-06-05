package Asgnpract.Conditional_Statments.Pyramid_2;
import java.util.*;

public class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        long a = 0;
        long b = 1;

        for (int i = 1; i <= rows; i++) {

            for (int s = 1; s <= rows - i; s++)
                System.out.print("   ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(a + " ");

                long c = a + b;
                a = b;
                b = c;
            }

            System.out.println();
        }
    }
}