package Asgnpract.Conditional_Statments.Nested_For_2;

//  i+j-1 pattern
// rows=4: 1 2 3 4
//         2 3 4 5
//         3 4 5 6
//         4 5 6 7

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print((i+j-1) + " ");

            System.out.println();
        }
    }
}