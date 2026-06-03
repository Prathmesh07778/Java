package Asgnpract.Conditional_Statments.For_Loop;

//  Table of N in reverse
import java.util.Scanner;

class L8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        for(int i = 10; i >= 1; i--)
            System.out.print(n * i + " ");
    }
}
