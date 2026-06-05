package Asgnpract.Conditional_Statments.Nested_For_2;

//  Alternating 1A 2B / reverse pattern
// rows=3: 1A 2B 3C
//         3C 2B 1A
//         1A 2B 3C

import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            if(i % 2 != 0)
                for(int j = 1; j <= n; j++)
                    System.out.print(j + "" + (char)('A'+j-1) + " ");
            else
                for(int j = n; j >= 1; j--)
                    System.out.print(j + "" + (char)('A'+j-1) + " ");

            System.out.println();
        }
    }
}
