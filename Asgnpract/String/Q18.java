package Asgnpract.String;

//  Check substring using contains()

import java.util.Scanner;

class Q18 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        sc.nextLine();

        System.out.print("Enter sentence: ");

        String sentence = sc.nextLine();

        System.out.print("Enter substring: ");

        String sub = sc.nextLine();

        if(sentence.toLowerCase().contains(sub.toLowerCase()))
            System.out.println("The sentence contains the substring \"" + sub + "\"");
        else
            System.out.println("Substring not found");
    }
}