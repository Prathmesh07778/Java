package Asgnpract.Conditional_Statments.Nested_For_2;

//  Letter+Number pattern (C1 C2 C3...)

import java.util.Scanner;

class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");

        int n = sc.nextInt();

        int count = 1;
        char letter = 'A' + (n-1) < 'Z' ? (char)('A'+(n-1)) : 'D';

        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++)
                System.out.print(letter + "" + count++ + " ");

            System.out.println();
        }
    }
}
