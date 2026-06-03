package Asgnpract.Conditional_Statments.Switch;

//  Two numbers - multiply if positive, switch for even/odd

import java.util.Scanner;

class Q8_Switch {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter num1: ");
        int num1 = sc.nextInt();
 
        System.out.print("Enter num2: ");
        int num2 = sc.nextInt();

        if(num1 < 0 || num2 < 0) {
            System.out.println("Sorry negative numbers are not allowed");
        } else {
 
            int result = num1 * num2;
            System.out.println("Product: " + result);
 
            switch(result % 2) {
                case 0: System.out.println(result + " is Even"); break;
                case 1: System.out.println(result + " is Odd");  break;
            }
        }
    }
}
