package Asgnpract.Conditional_Statments.Switch;

//  Subscription Plan 

import java.util.Scanner;

class Q7_Switch {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("1. Platinum\n2. Gold\n3. Silver\n4. Bronze\n5. free");
        System.out.print("Enter your plan: ");
 
        String plan = sc.next();

        switch(plan) {
 
            case "Platinum": System.out.println("For the Platinum plan, the price is 799"); break;
            case "Gold":     System.out.println("For the Gold plan, the price is 599");     break;
            case "Silver":   System.out.println("For the Silver plan, the price is 399");   break;
            case "Bronze":   System.out.println("For the Bronze plan, the price is 199");   break;
            case "free":     System.out.println("For less than 199, the platform is free with limited access"); break;
 
            default:         System.out.println("Invalid Input");
        }
    }
}
