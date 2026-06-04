package Asgnpract.Array;

//  Sum of odd rows only

import java.util.Scanner;

class Q24 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        for(int i = 0; i < r; i++) {

            if((i+1) % 2 != 0) {
                int sum = 0;
                for(int j = 0; j < c; j++) sum += arr[i][j];
                System.out.println("Sum of row " + (i+1) + " = " + sum);
            }
        }
    }
}