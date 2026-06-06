package Asgnpract.String;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");

        String s = sc.nextLine().toLowerCase();

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;

            }
        }

        System.out.println("Output: " + count);

        sc.close();
    }
}
