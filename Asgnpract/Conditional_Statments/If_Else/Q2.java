package Asgnpract.Conditional_Statments.If_Else;

import java.util.Scanner;

public class Q2 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number :");

        int num;
        num = sc.nextInt();

        if(num % 2 == 0){

            System.out.println(num + " is Even Number");

        }else{

            System.out.println(num + " is Odd Number ");
        }
    }
}
