package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Inverted number triangle (decreasing count)
// Rows=3: 3 3 3
//         2 2
//         1

import java.util.Scanner;

class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= i; j++)
                System.out.print(i + " ");

            System.out.println();
        }
    }
}
