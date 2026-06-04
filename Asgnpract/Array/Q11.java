package Asgnpract.Array;

// Count and print even numbers

import java.util.Scanner;

class Q11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
 
        int count = 0;
        System.out.print("even numbers: ");
 
        for(int i = 0; i < size; i++)
            if(arr[i] % 2 == 0) { System.out.print(arr[i] + " "); count++; }
 
        System.out.println("\nCount of even elements is: " + count);
    }
}