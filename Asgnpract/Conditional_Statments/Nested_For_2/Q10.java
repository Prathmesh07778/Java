package Asgnpract.Conditional_Statments.Nested_For_2;

//  Repeating # $ @ pattern
// rows=3: # # #
//         $ $ $
//         @ @ @

import java.util.Scanner;

class Q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");

        int n = sc.nextInt();
        char[] symbols = {'#', '$', '@', '?', '%'};

        for(int i = 0; i < n; i++) {

            for(int j = 0; j < n; j++)
                System.out.print(symbols[i % symbols.length] + " ");

            System.out.println();
        }
    }
}