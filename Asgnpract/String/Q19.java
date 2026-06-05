package Asgnpract.String;

//  Anagram check

import java.util.Scanner;
import java.util.Arrays;

class Q19 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter str1: ");

        String s1 = sc.next().toLowerCase();

        System.out.print("Enter str2: ");
        String s2 = sc.next().toLowerCase();

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        if(Arrays.equals(a1, a2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
