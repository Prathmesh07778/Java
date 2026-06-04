package Asgnpract.Array;

// Product of odd indexed elements

import java.util.Scanner;

class Q16 {
 
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter size: ");
 
        int size = sc.nextInt();
        int[] arr = new int[size];
 
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
 
        int product = 1;
        for(int i = 1; i < size; i += 2)
            product *= arr[i];
 
        System.out.println("product of odd indexed elements: " + product);
    }
}