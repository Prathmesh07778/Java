package Asgnpract.Conditional_Statments.If_Else_2;




//  Voter age verification

import java.util.Scanner;

class Q6_Voter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = sc.nextInt();

        if(age < 0)
            System.out.println("Invalid age");
        else if(age >= 18)
            System.out.println("Valid age for voting");
        else
            System.out.println("Not eligible for voting");
    }
}