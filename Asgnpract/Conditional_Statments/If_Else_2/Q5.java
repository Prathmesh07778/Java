package Asgnpract.Conditional_Statments.If_Else_2;


// Float divisible by 6

import java.util.Scanner;

class Q5_Float {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter float number: ");

        float num = sc.nextFloat();

        if(num % 6 == 0)
            System.out.println(num + " is divisible by 6");
        else
            System.out.println(num + " is not divisible by 6");
    }
}