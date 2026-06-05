package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Right-angle star triangle (spaces between stars)
// Row=4: * * * *
//          * * *
//            * *
//              *

import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            for(int s = 0; s < n-i; s++)
                System.out.print("  ");

            for(int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}