package Asgnpract.Conditional_Statments.Triangle_Pattern;

//  Consecutive number triangle
// rows=3: 1
//         2 3
//         4 5 6

import java.util.Scanner;

class T1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();
        int num = 1;

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= i; j++)
                System.out.print(num++ + " ");

            System.out.println();
        }
    }
}
