package Asgnpract.Conditional_Statments.If_Else;

// 4. Uppercase or Lowercase

import java.util.Scanner;

public class Q4 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        
        char ch;
        System.out.println("Enter Your Character : ");
        ch = sc.next().charAt(0);

        if(ch >='A' && ch  <= 'Z'){

            System.out.println(ch + " is the uppercase character");
        }else{

            System.out.println(ch + " is the lowercase character");
        }
        
    }
    
}
