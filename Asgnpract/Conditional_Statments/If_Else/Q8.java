package Asgnpract.Conditional_Statments.If_Else;

//  Divisible by 2, 5 and 10

import java.util.Scanner;

class Q8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");

        int num = sc.nextInt();

        if(num % 2 == 0 && num % 5 == 0 && num % 10 == 0)
            System.out.println(num + " is divisible by 2,5 and 10");
        else
            System.out.println(num + " Is Not Divisible By 2,5 and 10");
    }
}
