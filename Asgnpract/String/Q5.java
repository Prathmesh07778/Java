package Asgnpract.String;

import java.util.Scanner;
 
public class Q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.println("First: " + s.charAt(0) + ", Last: " + s.charAt(s.length() - 1));

        sc.close();
    }
}
 
