package Asgnpract.Conditional_Statments.If_Else;


import  java.util.Scanner;

public class Q6 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int num;
        System.out.println("Enter Your Number For Division :");
        num = sc.nextInt();

        if(num % 3 == 0 && num % 7 == 0){

            System.out.println(num + " is   divisible by  3 or  7");

        }else if(num % 3 == 0){

            System.out.println(num + " is divisible by 3");
        
        }else if( num % 7 == 0){

            System.out.println(num + " is divisible by 7");
        
        }else{

            System.out.println(num + " is not  divisible by  3 or  7");
        }

    }
}
