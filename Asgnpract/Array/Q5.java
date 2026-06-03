package Asgnpract.Array;

// A5. Elements less than 10
import java.util.Scanner;

class A5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < size; i++){

            if(arr[i] < 10);

        }
                int i = 0;
                System.out.println(arr[i] + " is less than 10");
    }
}