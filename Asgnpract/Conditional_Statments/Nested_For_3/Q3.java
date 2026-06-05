package Asgnpract.Conditional_Statments.Nested_For_3;

//  Row*col, row*(col+n-1)... number table
// rows=4: 1  5  9  13
//         2  6  10 14
//         3  7  11 15
//         4  8  12 16

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 0; j < n; j++)
                System.out.print((i + j*n) + "\t");

            System.out.println();
        }
    }
}