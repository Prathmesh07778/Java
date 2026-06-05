package Asgnpract.String;

//  StringTokenizer - comma separated words

import java.util.Scanner;
import java.util.StringTokenizer;

class Q17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter comma-separated words: ");

        String s = sc.next();

        StringTokenizer st = new StringTokenizer(s, ",");

        while(st.hasMoreTokens())
            System.out.println(st.nextToken().trim());
    }
}