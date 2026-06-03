package Asgnpract.Conditional_Statments.If_Else_2;

//  Pythagorean Triplet

import java.util.Scanner;

class Q9_Pythagoras {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");

        int a = sc.nextInt();

        System.out.print("Enter b: ");

        int b = sc.nextInt();

        System.out.print("Enter c: ");

        int c = sc.nextInt();

        if(a*a + b*b == c*c)
            System.out.println("it is a pythagorean triplet");
        else
            System.out.println("it is not a pythagorean triplet");
    }
}