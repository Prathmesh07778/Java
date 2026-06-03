package Asgnpract.Conditional_Statments.Switch;

// Q4. Calculator

import java.util.Scanner;

class Q4_Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter num2: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter operation (+,-,*,/,%): ");
        char op = sc.next().charAt(0);

       
        switch(op) {
       
            case '+': System.out.println("Output: " + (num1 + num2)); break;
       
            case '-': System.out.println("Output: " + (num1 - num2)); break;
       
            case '*': System.out.println("Output: " + (num1 * num2)); break;
       
            case '/':
                if(num2 != 0)
                    System.out.println("Output: " + (num1 / num2));
                else
                    System.out.println("Cannot divide by zero");
                break;
       
                case '%': System.out.println("Output: " + (num1 % num2)); break;
       
                default:  System.out.println("Invalid operator");
    
        }
    }
}