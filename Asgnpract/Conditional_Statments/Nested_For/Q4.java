package Asgnpract.Conditional_Statments.Nested_For;

//  Sequential numbers row by row
// rows=3: 1 2 3
//         4 5 6
//         7 8 9

import java.util.Scanner;

class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print(num++ + " ");

            System.out.println();
        }
    }
}