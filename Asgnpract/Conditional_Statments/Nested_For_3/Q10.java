package Asgnpract.Conditional_Statments.Nested_For_3;

//  Decreasing number grid n*n to 1
// rows=3: 12 11 10 (n*n down to 1, row by row)
//          9  8  7
//          6  5  4

import java.util.Scanner;

class Q10 {
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
