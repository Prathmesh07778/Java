package Asgnpract.Array;

//  Product of sum of primary and secondary diagonal

import java.util.Scanner;

class Q29 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();
 
        int[][] arr = new int[r][c];
 
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
 
        int sum1 = 0, sum2 = 0;
 
        for(int i = 0; i < r; i++) {
            sum1 += arr[i][i];
            sum2 += arr[i][c-1-i];
        }
 
        System.out.println("Product of Sum of Primary and Secondary Diagonal: " + (sum1 * sum2));
    }
}
