package Asgnpract.Conditional_Statments.Switch;

//  5 subjects - pass/fail with grade using switch

import java.util.Scanner;

class Q9_Switch {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter marks for 5 subjects:");
        int m1 = sc.nextInt(), m2 = sc.nextInt(), m3 = sc.nextInt();
        int m4 = sc.nextInt(), m5 = sc.nextInt();

        if(m1 < 35 || m2 < 35 || m3 < 35 || m4 < 35 || m5 < 35) {
            System.out.println("You failed the exam");
        } else {
            int avg = (m1 + m2 + m3 + m4 + m5) / 5;
            int grade;
 
            if(avg >= 75)      grade = 1;
            else if(avg >= 60) grade = 2;
            else if(avg >= 50) grade = 3;
            else               grade = 4;

            switch(grade) {
                case 1: System.out.println("First class with distinction"); break;
                case 2: System.out.println("First class");                  break;
                case 3: System.out.println("Second class");                 break;
                default:System.out.println("Pass");
            }
        }
    }
}