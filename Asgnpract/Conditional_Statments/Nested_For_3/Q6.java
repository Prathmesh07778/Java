package Asgnpract.Conditional_Statments.Nested_For_3;

// Reverse decreasing grid
// rows=4: 16 15 14 13
//         12 11 10  9
//          8  7  6  5
//          4  3  2  1

import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();
        int num = n * n;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print(num-- + "\t");

            System.out.println();
        }
    }
}
