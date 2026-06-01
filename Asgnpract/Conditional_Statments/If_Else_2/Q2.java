package Asgnpract.Conditional_Statments.If_Else_2;

//  Table of 13

import java.util.Scanner;

class Q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        
        int num = sc.nextInt();
        
        if(num % 13 == 0)
            System.out.println(num + " is in the table of 13");
        else
            System.out.println(num + " is not in the table of 13");
    }
}

