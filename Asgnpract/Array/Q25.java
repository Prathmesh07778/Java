package Asgnpract.Array;

//  Sum of each column

import java.util.Scanner;

class Q25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        for(int j = 0; j < c; j++) {
            int sum = 0;
            for(int i = 0; i < r; i++) sum += arr[i][j];

            System.out.println("Sum of column " + (j+1) + " = " + sum);
        }
    }
}