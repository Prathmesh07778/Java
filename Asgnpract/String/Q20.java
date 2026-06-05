package Asgnpract.String;

//. Reverse each word using StringBuffer

import java.util.Scanner;

class S20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Enter sentence: ");

        String s = sc.nextLine();

        String[] words = s.split(" ");

        StringBuilder result = new StringBuilder();

        for(String w : words) {
            StringBuffer sb = new StringBuffer(w);
            result.append(sb.reverse()).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}