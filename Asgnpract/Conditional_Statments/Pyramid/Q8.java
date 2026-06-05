package Asgnpract.Conditional_Statments.Pyramid;


import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i >= 1; i--) {

            for (int j = i; j < n; j++) System.out.print("  ");

            for (int j = 1; j <= (2 * i - 1); j++) {

                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
