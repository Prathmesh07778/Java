package Asgnpract.String;

import java.util.Scanner;
 
public class Q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.nextLine();

        System.out.print("Enter index: ");

        int index = sc.nextInt();

        System.out.println("Output: " + s.charAt(index));

        sc.close();
    }
}
