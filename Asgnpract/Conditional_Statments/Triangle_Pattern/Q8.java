package Asgnpract.Conditional_Statments.Triangle_Pattern;

//  Increasing count per row (1 col, 2 col...)
// rows=3: 1
//         2 3
//         3 4 (starts from row number)

import java.util.Scanner;

class T8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = i; j <= i+i-1; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
