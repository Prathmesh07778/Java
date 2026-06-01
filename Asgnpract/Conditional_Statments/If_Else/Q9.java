package Asgnpract.Conditional_Statments.If_Else;

import java.util.Scanner;


public class Q9 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Day Number (1-7)");

        int day;
        day = sc.nextInt();

        if(day == 1 ){

            System.out.println( day + " is Monday");
        
        }else if(day == 2 ){

            System.out.println( day + " is Tuesday");
        
        }else if(day == 3 ){

            System.out.println( day + " is Wednesday");
        
        }else if(day == 4 ){

            System.out.println( day + " is Thrusday");
        
        }else if(day == 5 ){

            System.out.println( day + " is Friday");
        
        }else if(day == 6 ){

            System.out.println( day + " is Saturday");
        
        }if(day == 1 ){

            System.out.println( day + " is Sunday");
        }

        
        
    }
}
