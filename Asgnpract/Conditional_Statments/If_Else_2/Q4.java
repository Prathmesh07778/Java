package Asgnpract.Conditional_Statments.If_Else_2;

// Career suggestion

import java.util.Scanner;

class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");

        double percentage = sc.nextDouble();

        if(percentage > 85.00)
            System.out.println("Medical");
        else if(percentage > 75.00)
            System.out.println("Engineering");
        else
            System.out.println("Other field");

    }
}
