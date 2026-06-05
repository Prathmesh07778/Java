package Asgnpract.Conditional_Statments.Number_System_2;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int start = sc.nextInt();
        int end = sc.nextInt();

        for (int num = start; num <= end; num++) {

            String str = String.valueOf(num);

            if (!str.startsWith("0") && str.contains("0")) {
                System.out.print(num + " ");
            }
        }
    }
}
