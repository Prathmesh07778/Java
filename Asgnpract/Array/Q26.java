package Asgnpract.Array;

//  Elements divisible by 3 in 2D array

import java.util.Scanner;

class Q26 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();
 
        int[][] arr = new int[r][c];
 
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
 
        System.out.print("Output: ");
 
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                if(arr[i][j] % 3 == 0)
 
                    System.out.print(arr[i][j] + " ");
    }
}
