package Asgnpract.String;

import java.util.Scanner;
 
public class Q6 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter string: ");
 
        String s = sc.nextLine();
 
        String reversed = "";
 
        for (int i = s.length() - 1; i >= 0; i--) {
 
            reversed += s.charAt(i);
        }
 
        System.out.println("Output: " + reversed);
 
        sc.close();
    }
}