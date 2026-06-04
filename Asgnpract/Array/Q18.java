package Asgnpract.Array;

//  Elements greater than 5 but less than 9

import java.util.Scanner;

class A18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");

        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i < size; i++){

            arr[i] = sc.nextInt();


        }

        for(int i = 0; i < size; i++){

            if(arr[i] > 5 && arr[i] < 9)
        }
            
                System.out.println(arr[i] + " is greater than 5 but less than 9");
    }
}
