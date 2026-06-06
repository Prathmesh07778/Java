package Asgnpract.String;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1: ");

        String s1 = sc.nextLine();

        System.out.print("Input 2: ");

        String s2 = sc.nextLine();

        String result = s1 + s2;

        System.out.println("Output: " + result);

        System.out.println("Length of String: " + result.length());

        sc.close();
    }
}
