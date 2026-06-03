package Asgnpract.Array;

// A3. Print even elements from array
import java.util.Scanner;

class A3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter size: ");
 
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }
        for(int i = 0; i < size; i++){

            if(arr[i] % 2 == 0){

                System.out.println(arr[i]);

            }
        }
    }
}