package Asgnpract.Conditional_Statments.Switch;


//  Number spelling 0-5

import java.util.Scanner;

class Q6_Spelling {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        switch(num) {
 
            case 0: System.out.println("Zero");  break;
            case 1: System.out.println("One");   break;
            case 2: System.out.println("Two");   break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four");  break;
            case 5: System.out.println("Five");  break;
 
            default: System.out.println(num + " is greater than 5.");
        }
    }
}
