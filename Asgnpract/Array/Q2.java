package Asgnpract.Array;

// A2. Take 10 elements from user and print
import java.util.Scanner;

class A2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];

        System.out.println("Enter 10 elements:");

        for(int i = 0; i < 10; i++){

            arr[i] = sc.nextInt();

        }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
