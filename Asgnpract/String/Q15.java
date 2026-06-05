package Asgnpract.String;

//  Split string into words

import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        sc.nextLine();
 
        System.out.print("Enter string: ");
 
        String s = sc.nextLine();
 
        String[] words = s.split(" ");
 
        for(String w : words)
            System.out.println(w);
    }
}