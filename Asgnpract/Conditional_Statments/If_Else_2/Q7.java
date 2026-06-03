package Asgnpract.Conditional_Statments.If_Else_2;

//  Profit or Loss

import java.util.Scanner;

class Q7_Profit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter selling price: ");

        double sp = sc.nextDouble();

        System.out.print("Enter cost price: ");

        double cp = sc.nextDouble();

        if(sp > cp)
            System.out.println("Profit of " + (sp - cp));
        else if(sp < cp)
            System.out.println("loss of " + (cp - sp));
        else
            System.out.println("No profit no loss");
    }
}