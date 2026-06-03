package Asgnpract.Conditional_Statments.If_Else_2;

//  Real-time example - electricity bill calculator

import java.util.Scanner;

class Q10_RealTime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");

        int units = sc.nextInt();
        double bill;

        if(units <= 100)
            bill = units * 1.5;
        else if(units <= 300)
            bill = 100*1.5 + (units-100) * 2.5;
        else
            bill = 100*1.5 + 200*2.5 + (units-300) * 5.0;

        System.out.println("Electricity bill: Rs." + bill);
    }
}
