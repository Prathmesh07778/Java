package Asgnpract.Conditional_Statments.Nested_For;

//  All 1s square

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print("1 ");

            System.out.println();
        }
    }
}
