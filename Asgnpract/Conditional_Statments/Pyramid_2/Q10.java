package Asgnpract.Conditional_Statments.Pyramid_2;

import java.util.*;

 class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();

        int num = 1;

        for (int i = 1; i <= rows; i++) {

            for (int s = 1; s <= rows - i; s++)
                System.out.print("   ");

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.printf("%3d", num++);
            }

            System.out.println();
        }
    }
}