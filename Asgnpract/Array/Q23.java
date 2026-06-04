package Asgnpract.Array;

//  Sum of each row

import java.util.Scanner;

class Q23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        for(int i = 0; i < r; i++) {
            int sum = 0;

            for(int j = 0; j < c; j++) sum += arr[i][j];

            System.out.println("Sum of row " + (i+1) + " = " + sum);
        }
    }
}