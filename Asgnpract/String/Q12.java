package Asgnpract.String;

//  Check if two strings are equal

import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter str1: ");

        String s1 = sc.next();

        System.out.print("Enter str2: ");

        String s2 = sc.next();

        System.out.println(s1.equals(s2));
    }
}