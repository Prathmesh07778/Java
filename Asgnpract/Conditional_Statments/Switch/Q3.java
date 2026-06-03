package Asgnpract.Conditional_Statments.Switch;

//  Cloth Size Acronym

import java.util.Scanner;

class Q3_Size {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        String size = sc.next();


        
        switch(size) {
        
            case "S":  System.out.println("Small");       break;
        
            case "M":  System.out.println("Medium");      break;
        
            case "L":  System.out.println("Large");       break;
            
            case "XL": System.out.println("Extra Large"); break;

            case "XXL":System.out.println("Double Extra Large"); break;

            default:   System.out.println("Invalid size");

        }
    }
}
