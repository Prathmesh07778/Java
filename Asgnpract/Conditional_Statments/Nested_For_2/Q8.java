package Asgnpract.Conditional_Statments.Nested_For_2;

//  Powers and sequential mix
// rows=4: 1   2   9   4
//         26  6  49   8
//         81  10 121  12
//         169 14 225  16

import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(j % 2 != 0)
                    System.out.print((int)Math.pow(2*i*j - 1, 2) + "\t");
                else
                    System.out.print((i*j*2 - 2 + j) + "\t");
            }

            System.out.println();
        }
    }
}