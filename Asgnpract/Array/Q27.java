package Asgnpract.Array;


//  Product of primary diagonal

import java.util.Scanner;

class Q27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: "); int r = sc.nextInt();
        System.out.print("Enter columns: "); int c = sc.nextInt();

        int[][] arr = new int[r][c];

        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();

        long product = 1;

        for(int i = 0; i < r; i++)
            product *= arr[i][i];

        System.out.println("Product of Primary Diagonal: " + product);
    }
}