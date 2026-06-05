package Asgnpract.String;

//  Remove void spaces (trim)

import java.util.Scanner;

class Q13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.println(s.trim());
    }
}
