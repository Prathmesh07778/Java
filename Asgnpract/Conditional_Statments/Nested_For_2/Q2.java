package Asgnpract.Conditional_Statments.Nested_For_2;

//  Power of row * col
// rows=3: 1   4   9
//         16  25  36
//         49  64  81

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print((i*n - n + j) * (i*n - n + j) + "\t");

            System.out.println();
        }
    }
}
