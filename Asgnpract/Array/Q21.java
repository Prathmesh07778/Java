package Asgnpract.Array;

//  Take 2D array input and print
import java.util.Scanner;

class Q21 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
 
        System.out.print("Enter columns: ");
 
        int c = sc.nextInt();
        int[][] arr = new int[r][c];
 
        for(int i = 0; i < r; i++)
            for(int j = 0; j < c; j++)
                arr[i][j] = sc.nextInt();
 
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++)
                System.out.print(arr[i][j] + "\t");
 
            System.out.println();
        }
    }
}