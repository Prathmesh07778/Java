package Asgnpract.Conditional_Statments.Invereted_Space_Triangle;

import java.util.Scanner;

// Rows=3:   24  21  18
//               15  12
//                    9
// Rows=4:   60  56  52  48
//               44  40  36
//                   32  28
//                       24
// Each row decreases by 4, starting from n*(n+1)*something

public class Q10 {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Number of rows: ");
        int n = sc.nextInt();
 
        // Find starting value: for n=3 starts at 24=n*(n+1)*2= 3*4*2=24 ✓
        // for n=4 starts at 60 = 4*5*3 = 60 ✓
 
        int start = n * (n + 1) * (n - 1);
 
        // Actually: n=3 → 3*4*2=24, n=4 → 4*5*3=60 → formula = n*(n+1)*(n-1)
 
        int num = start;
 
        for (int i = 0; i < n; i++) {
 
            for (int s = 0; s < i; s++) System.out.print("    ");
 
            for (int j = 0; j < n - i; j++) {
 
                System.out.printf("%-4d", num);
                num -= 4;

            }

            System.out.println();

        }

        sc.close();
    }
}
