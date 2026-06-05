package Asgnpract.Conditional_Statments.Nested_For;

//  User string repeated square

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.next();

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print(s + " ");

            System.out.println();
        }
    }
}