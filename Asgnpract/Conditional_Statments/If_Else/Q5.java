package Asgnpract.Conditional_Statments.If_Else;

// 5. Divisible by 7 or not

import java.util.Scanner;

public class Q5 {
    
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter Your Number for division :");
        num = sc.nextInt();

        if(num % 7 == 0){

            System.out.println(num +  " is divisble by 7");

        }else{

            System.out.println(num + " is not divisble by 7");
        }

    }
}
