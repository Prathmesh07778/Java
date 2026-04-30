package Asgnpract.Conditional_Statments.If_Else;


import java.util.Scanner;

public class Q1 {
    
    public static void main(String[] args){

       

        Scanner sc = new Scanner(System.in);
        
        int num;
        System.out.println("Enter Your Number : ");
        num = sc.nextInt();

        if (num > 0) {
            System.out.println(num + " is a positive number");
        } else if (num < 0) {
            System.out.println(num + " is a negative number");
        } else {
            System.out.println(num + " is zero");


        }

    }
}
