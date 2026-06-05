package Asgnpract.String;

//  Replace 'a' with 'e'

import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.println(s.replace('a', 'e'));
    }
}
