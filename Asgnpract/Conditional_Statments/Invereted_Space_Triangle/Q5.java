package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;
import java.util.Scanner;

// Rows=3:   A  b  C
//              1  2
//                 C
// Rows=4:   1  2  3  4
//              A  B  C
//                 1  2
//                    A
// Pattern: row 1→numbers, row 2→uppercase, row 3→numbers, row 4→uppercase...

public class Q5 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("   ");
 
            int count = n - i;
 
            for (int j = 0; j < count; j++) {
 
                // alternate: row 0 → uppercase A,b,C... row 1 → numbers...
 
                if (i % 2 == 0) {
 
                    // uppercase for even col, lowercase for odd col
 
                    if (j % 2 == 0) System.out.printf("%-3c", (char)('A' + j));
 
                    else             System.out.printf("%-3c", (char)('a' + j));
 
                } else {
 
                    System.out.printf("%-3d", j + 1);
                }
            }
 
            System.out.println();
        }
 
        sc.close();
    }
}