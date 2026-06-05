package Asgnpract.Conditional_Statments.Nested_For_3;

//  Alternating reverse/forward/reverse rows
// rows=3: C B A
//         1 2 3
//         C B A

import java.util.Scanner;

class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(i % 2 != 0)
                    System.out.print((char)('A' + n - j) + " ");
                else
                    System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}