package Asgnpract.Conditional_Statments.For_Loop;

// Numbers in reverse from N to 10

import java.util.Scanner;

class L6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for(int i = n; i >= 10; i--){

            System.out.print(i + " ");
        }
            
    }
}
