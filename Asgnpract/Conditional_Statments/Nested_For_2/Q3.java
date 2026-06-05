package Asgnpract.Conditional_Statments.Nested_For_2;

//  Lowercase reverse alphabet square (d c b a)

import java.util.Scanner;

class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            for(int j = n-1; j >= 0; j--)
                System.out.print((char)('a'+j) + " ");

            System.out.println();
        }
    }
}
