package Asgnpract.String;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter str1: ");
 
        String str1 = sc.nextLine();
 
        System.out.print("Enter str2: ");
 
        String str2 = sc.nextLine();

        int diff = 0;
        int minLen = Math.min(str1.length(), str2.length());
 
        for (int i = 0; i < minLen; i++) {
 
            if (str1.charAt(i) != str2.charAt(i)) {
 
                diff = str1.charAt(i) - str2.charAt(i);
                break;
 
            }
        }
 
        System.out.println("Difference = " + diff);
 
        sc.close();
    }
}