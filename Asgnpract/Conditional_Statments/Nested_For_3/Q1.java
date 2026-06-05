package Asgnpract.Conditional_Statments.Nested_For_3;

//  Reverse alphabet decreasing per row
// rows=4: D D D D
//         C C C
//         B B
//         A A A A (full row)

import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {
            for(int j = 1; j <= n; j++)
                System.out.print((char)('A'+i-1) + " ");

            System.out.println();
        }
    }
}