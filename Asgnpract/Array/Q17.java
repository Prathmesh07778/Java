package Asgnpract.Array;

//  Even size = alternate elements, else whole array

import java.util.Scanner;

class Q17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
 
        System.out.println("Array elements are:");
        if(size % 2 == 0) {
            for(int i = 0; i < size; i += 2)
                System.out.println(arr[i]);
        } else {
            for(int i = 0; i < size; i++)
                System.out.println(arr[i]);
        }
    }
}
