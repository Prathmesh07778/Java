package Asgnpract.Conditional_Statments.Invereted_Triangle;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int rows = sc.nextInt();

        for (int i = rows; i >= 1; i--) {

            char small = (char)('a' + i - 1);
            char capital = (char)('A' + i - 2);

            for (int j = 1; j <= i; j++) {

                if (j % 2 != 0) {
                    System.out.print(small + " ");
                    small--;
                } else {
                    System.out.print(capital + " ");
                    capital--;
                }
            }

            System.out.println();
        }
    }
}