package Asgnpract.Conditional_Statments.Triangle_Pattern;

//  N decreasing triangle
// rows=3: 3
//         3 2
//         3 2 1

import java.util.Scanner;

class T3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = n; j >= n-i+1; j--)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}