package Asgnpract.Array;

//  Search element and return index

import java.util.Scanner;

class Q14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter number to search: ");

        int key = sc.nextInt();
        boolean found = false;

        for(int i = 0; i < size; i++) {

            if(arr[i] == key) {
                System.out.println(key + " found at index " + i);
                found = true;
            }
        }
        if(!found) System.out.println(key + " not found");
    }
}