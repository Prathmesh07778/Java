package Asgnpract.String;

//  Palindrome check using StringBuffer

import java.util.Scanner;

class Q16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.next();

        StringBuffer sb = new StringBuffer(s);

        if(s.equals(sb.reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
