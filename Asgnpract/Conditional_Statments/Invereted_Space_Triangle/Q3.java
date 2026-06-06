package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   a  1  b
//              1  c
//                 d
// Rows=4:   a  1  b  2
//              1  c  2
//                 d  2
//                    2
// Pattern: col1=letter, col2=number 1, col3=letter, col4=number 2 ...
// Each row starts one column further right

public class Q3 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
        char letter = 'a';
 
        // pre-build the full row array
 
        String[] cols = new String[n];
 
        for (int j = 0; j < n; j++) {
 
            if (j % 2 == 0) cols[j] = String.valueOf(letter++);
 
            else             cols[j] = String.valueOf(j / 2 + 1);
        }
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("   ");
 
            for (int j = i; j < n; j++) {
 
                System.out.printf("%-3s", cols[j]);
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}
