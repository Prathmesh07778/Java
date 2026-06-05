package Asgnpract.Conditional_Statments.Nested_For_2;

//  Odd sequential numbers
// rows=3: 1  2  3
//         3  4  5
//         5  6  7

import java.util.Scanner;

class Q1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter rows: ");
        
        int n = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
         
            for(int j = 1; j <= n; j++)
                System.out.print((2*i+j) + " ");
         
            System.out.println();
        }
    }
}