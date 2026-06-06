package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   A  b  c
//              D  e
//                 F
// Rows=4:   A  b  C  d
//              E  f  G
//                 H  i
//                    J
// Uppercase for odd position overall, lowercase for even

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int n = sc.nextInt();
        int pos = 0;

        for (int i = 0; i < n; i++) {

            for (int s = 0; s < i; s++) System.out.print("   ");

            for (int j = 0; j < n - i; j++) {

                char c;

                if (pos % 2 == 0) c = (char)('A' + pos);

                else               c = (char)('a' + pos);

                System.out.printf("%-3c", c);

                pos++;

            }

            System.out.println();
        }

        sc.close();
    }
}
