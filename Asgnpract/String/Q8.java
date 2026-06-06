package Asgnpract.String;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.println("Output: " + s.startsWith("Hello"));

        sc.close();
    }
}
