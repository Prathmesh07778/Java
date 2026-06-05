package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Reverse alphabet space triangle
// rows=4: D C B A
//           D C B
//             D C
//               D

import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int s = 0; s < i-1; s++)
                System.out.print("  ");

            for(int j = n-1; j >= i-1; j--)
                System.out.print((char)('A'+j) + " ");

            System.out.println();
        }
    }
}
