package Asgnpract.Conditional_Statments.Switch;

//  Grades to Remarks

import java.util.Scanner;

class Q2_Grades {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        String grade = sc.next();


        
        switch(grade) {
        
            case "O": System.out.println("Outstanding"); break;
        
            case "A": System.out.println("Excellent");   break;
        
            case "B": System.out.println("Very Good");   break;
        
            case "C": System.out.println("Good");        break;
        
            case "D": System.out.println("Average");     break;
            
            case "F": System.out.println("Fail");        break;
       
            default:  System.out.println("Invalid grade");
        }
    }
}
