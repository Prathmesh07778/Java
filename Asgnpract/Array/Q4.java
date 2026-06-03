package Asgnpract.Array;


// A4. Sum of odd elements
import java.util.Scanner;

class A4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();
        }    


        int sum = 0;

        for(int i = 0; i < size; i++){

            if(arr[i] % 2 != 0) sum += arr[i];

        }

        System.out.println("Sum of odd elements: " + sum);
    }
}
