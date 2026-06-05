package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {

            int num = i;
            char ch = (char)('a' + i - 2);

            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print(num + " ");
                    num--;
                } else {
                    System.out.print(ch + " ");
                    ch--;
                }
            }

            System.out.println();
        }
    }
}