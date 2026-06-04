package Asgnpract.Array;

//  Corner elements of 2D array

import java.util.Scanner;

class Q30 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        // top-left, top-right, bottom-left, bottom-right

        System.out.println("Output: "
            + arr[0][0] + " "
            + arr[0][c-1] + " "
            + arr[r-1][0] + " "
            + arr[r-1][c-1]);
    }
}