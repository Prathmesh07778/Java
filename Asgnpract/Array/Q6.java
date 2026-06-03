package Asgnpract.Array;

// A6. Character array input and print
import java.util.Scanner;

class A6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        char[] arr = new char[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.next().charAt(0);

        }
        for(int i = 0; i < size; i++){

            System.out.print(arr[i] + " ");
        }            
    }
}