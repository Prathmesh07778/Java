package Asgnpract.Array;

//  Sum of secondary diagonal

import java.util.Scanner;

class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        int sum = 0;


        for(int i = 0; i < r; i++)
            sum += arr[i][c-1-i];

        System.out.println("Sum of Secondary Diagonal: " + sum);
    }
}
