package Asgnpract.Array;

//  Maximum element with position
import java.util.Scanner;

class Q20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();

        }
        int max = arr[0], pos = 0;

        for(int i = 1; i < size; i++){

            if(arr[i] > max) { max = arr[i]; pos = i; }

        }
        System.out.println("Maximum number in the array is found at pos " + pos + " is " + max);
    }
}