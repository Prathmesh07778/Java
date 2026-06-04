package Asgnpract.Array;

// Sum of elements divisible by 3

import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();

        int sum = 0;

        System.out.print("Elements divisible by 3: ");
        for(int i = 0; i < size; i++)
            if(arr[i] % 3 == 0) { System.out.print(arr[i] + " "); sum += arr[i]; }

        System.out.println("\nSum of elements divisible by 3 is: " + sum);
    }
}
