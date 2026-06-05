package Asgnpract.Conditional_Statments.Nested_For_3;

//  i*j pattern
// rows=4: 1  2  3  4
//         2  4  6  8
//         3  6  9  12
//         4  8  12 16

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print((i*j) + "\t");

            System.out.println();
        }
    }
}