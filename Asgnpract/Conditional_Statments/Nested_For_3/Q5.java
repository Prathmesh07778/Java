package Asgnpract.Conditional_Statments.Nested_For_3;

//  Power pattern (i^j * j pattern)
// rows=4: 1    4   27   16
//         125  36  343  64
//         729  100 1331 144
//         2197 196 3375 256

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(j % 2 != 0)
                    System.out.print((int)Math.pow(2*i+j-2, j) + "\t");
                else
                    System.out.print((i*j*(n-1) + j) + "\t");
            }

            System.out.println();
        }
    }
}