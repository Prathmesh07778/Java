package Asgnpract.Conditional_Statments.Nested_For_2;

//  Decreasing row * col pattern
// rows=3: 3 6 9
//         2 5 8
//         1 4 7

import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= n; j++)
                System.out.print((i + (j-1)*n) + " ");

            System.out.println();
        }
    }
}