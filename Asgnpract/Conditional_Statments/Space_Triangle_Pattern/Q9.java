package Asgnpract.Conditional_Statments.Space_Triangle_Pattern;

//  Alphabet with row number pattern
// rows=3: A 66 C
//            66 C
//               C

import java.util.Scanner;

class P9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {

            for(int s = 0; s < i; s++)
                System.out.print("    ");

            for(int j = i; j < n; j++) {

                if(j % 2 == 0)
                    System.out.print((char)('A' + j) + "  ");
                else
                    System.out.print((j+1)*n + " ");
            }

            System.out.println();
        }
    }
}
