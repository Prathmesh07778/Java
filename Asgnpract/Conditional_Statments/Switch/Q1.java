package Asgnpract.Conditional_Statments.Switch;

//  Traffic Light Color

import java.util.Scanner;

class Q1_Traffic {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter color: ");

        String color = sc.next();

        switch(color) {

            case "Red":   System.out.println("Stop");  break;

            case "Green": System.out.println("Go");    break;

            case "Yellow":System.out.println("Wait");  break;

            default: System.out.println("No such color is present in traffic lights.");
        }
    }
}
