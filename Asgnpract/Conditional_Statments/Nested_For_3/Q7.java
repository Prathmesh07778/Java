package Asgnpract.Conditional_Statments.Nested_For_3;

//  Alternating Char/num/char pattern per row
// rows=3: C C C
//         2 2 2
//         A A A

import java.util.Scanner;

class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            for(int j = 1; j <= n; j++) {

                if(i % 2 != 0)
                    System.out.print((char)('A'+i-1) + " ");
                else
                    System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
