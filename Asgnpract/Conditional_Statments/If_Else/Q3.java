package Asgnpract.Conditional_Statments.If_Else;

import java.util.Scanner;


public class Q3 {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your number");

        int num;
        num = sc.nextInt();

        if(num < 10){

            System.out.println(num + " is Less than 10");
        
        }else if(num > 10){

            System.out.println(num + " is Greater than 10");
        
        }else{

            System.out.println(num + " is equal to 10");
        }
    }
}
