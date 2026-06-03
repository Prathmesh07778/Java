package Asgnpract.Conditional_Statments.For_Loop;

//  Count of odd numbers between 1 and N

import java.util.Scanner;

class L10 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int count = 0;
 
        for(int i = 1; i <= n; i++)
            if(i % 2 != 0) count++;
 
        System.out.println("Count of odd numbers: " + count);
    }
}
