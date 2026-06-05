package Asgnpract.Conditional_Statments.Nested_For_3;

//  Col: odd=letter N-j, even=num j, odd=letter j-1
// rows=3: C 2 A
//         A 2 C
//         C 2 A

import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                if(j % 2 == 0)
                    System.out.print(j + " ");
                else if(i % 2 != 0)
                    System.out.print((char)('A' + n - j) + " ");
                else
                    System.out.print((char)('A' + j - 1) + " ");
            }

            System.out.println();
        }
    }
}
