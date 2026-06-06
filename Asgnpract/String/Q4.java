package Asgnpract.String;

import java.util.Scanner;
 
public class Q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string 1: ");

        String s1 = sc.nextLine();

        System.out.print("Enter string 2: ");

        String s2 = sc.nextLine();

        System.out.println("Output: " + (s1.equalsIgnoreCase(s2) ? "Equal" : "Not Equal"));

        sc.close();
    }
}
 