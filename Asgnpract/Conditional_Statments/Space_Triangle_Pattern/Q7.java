package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Number triangle (row number repeated)
// Rows=3: 1 2 3
//           2 3
//             3

import java.util.Scanner;

class P7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int s = 0; s < i-1; s++)
                System.out.print("  ");

            for(int j = i; j <= n; j++)
                System.out.print(j + " ");

            System.out.println();
        }
    }
}
