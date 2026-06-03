package Asgnpract.Array;

// A9. Print odd indexed elements
import java.util.Scanner;

class A9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }
        for(int i = 1; i < size; i += 2){

            System.out.println(arr[i] + " is an odd indexed element");

        }
     }
}
